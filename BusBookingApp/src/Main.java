import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame busBookingApp = new JFrame("Bus Booking App");

        JLabel name = new JLabel("Name");
        JLabel email = new JLabel("E-mail");
        JLabel mobile = new JLabel("Mobile");
        JLabel address = new JLabel("Address");
        JLabel source = new JLabel("Source");
        JLabel destination = new JLabel("Destination");
        JLabel payment = new JLabel("Payment");
        JLabel gender = new JLabel("Gender");
        JLabel registrationId = new JLabel();

        for (JLabel jLabel : Arrays.asList(name, email, mobile, address, source, destination, payment, gender)) {
            jLabel.setVisible(true);
            jLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        }

        name.setBounds(10, 10, 150, 30);
        email.setBounds(10, 50, 150, 30);
        mobile.setBounds(10, 90, 150, 30);
        address.setBounds(10, 130, 150, 30);
        source.setBounds(10, 170, 150, 30);
        destination.setBounds(10, 210, 150, 30);
        payment.setBounds(10, 250, 150, 30);
        gender.setBounds(10, 290, 150, 30);

        for (JLabel jLabel : Arrays.asList(name, email, mobile, address, source, destination, payment, gender, registrationId)) {
            busBookingApp.add(jLabel);
        }

        JTextField name_tf = new JTextField();
        JTextField email_tf = new JTextField();
        JTextField mobile_tf = new JTextField();
        JTextField address_tf = new JTextField();
        JTextField source_tf = new JTextField();
        JTextField destination_tf = new JTextField();
        JTextField payment_tf = new JTextField();
        JTextField gender_tf = new JTextField();

        for (JTextField jTextField : Arrays.asList(name_tf, email_tf, mobile_tf, address_tf, source_tf, destination_tf, payment_tf, gender_tf)) {
            jTextField.setVisible(true);
            jTextField.setFont(new Font("Arial", Font.ITALIC, 20));
        }

        name_tf.setBounds(130, 10, 230, 30);
        email_tf.setBounds(130, 50, 230, 30);
        mobile_tf.setBounds(130, 90, 230, 30);
        address_tf.setBounds(130, 130, 230, 30);
        source_tf.setBounds(130, 170, 230, 30);
        destination_tf.setBounds(130, 210, 230, 30);
        payment_tf.setBounds(130, 250, 230, 30);
        gender_tf.setBounds(130, 290, 230, 30);


        for (JTextField jTextField : Arrays.asList(name_tf, email_tf, mobile_tf, address_tf, source_tf, destination_tf, payment_tf, gender_tf)) {
            busBookingApp.add(jTextField);
        }

        JButton book_bt = new JButton("Book Now");
        JButton cancelBtn = new JButton("Cancel");
        JButton exitBtn = new JButton("Exit");

        for (JButton jButton : Arrays.asList(book_bt, cancelBtn, exitBtn)) {
            jButton.setVisible(true);
            jButton.setFont(new Font("Arial", Font.PLAIN, 20));
        }
        for (int i = 10; i <= 200; i++) {
            for (JButton jButton : Arrays.asList(book_bt, cancelBtn)) {
                jButton.setBounds(i, 350, 150, 30);
                i = i + 200;
            }
        }
        registrationId.setBounds(10, 500, 200, 40);

        exitBtn.setBounds(105, 390, 150, 30);
        for (JButton jButton : Arrays.asList(book_bt, cancelBtn, exitBtn)) {
            busBookingApp.add(jButton);
        }
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (JTextField jTextField : Arrays.asList(name_tf, email_tf, mobile_tf, address_tf, source_tf, destination_tf, payment_tf, gender_tf)) {
                    jTextField.setText("");
                }
            }
        });
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        book_bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_tf.getText().isEmpty() ||
                        email_tf.getText().isEmpty() ||
                        mobile_tf.getText().isEmpty() ||
                        address_tf.getText().isEmpty() ||
                        source_tf.getText().isEmpty() ||
                        destination_tf.getText().isEmpty() ||
                        payment_tf.getText().isEmpty() ||
                        gender_tf.getText().isEmpty()) {
                    JOptionPane.showInternalMessageDialog(null, "Please Fill All Required Details");
                } else {
                    String url = "jdbc:mysql://localhost:3306/busbooking";
                    String username = "root";
                    String password = "";



                    try (Connection connection = DriverManager.getConnection(url, username, password)) {
                        String sql = "insert into ticketbooking" + " values(null,?,?,?,?,?,?,?,?,?)";

                        PreparedStatement preparedStmt = connection.prepareStatement(sql);
                        preparedStmt.setString (1,name_tf.getText());
                        preparedStmt.setString (2, email_tf.getText());
                        preparedStmt.setString (3, mobile_tf.getText());
                        preparedStmt.setString (4, address_tf.getText());
                        preparedStmt.setString (5, source_tf.getText());
                        preparedStmt.setString (6, destination_tf.getText());
                        preparedStmt.setString (7, payment_tf.getText());
                        preparedStmt.setString (8, gender_tf.getText());
                        preparedStmt.setString(9, registrationId.getText());
                        preparedStmt.execute();

                        System.out.println("DATABASE CONNECTED");

                    } catch (SQLException E) {
                        System.out.println("CONNECTION FAILED ---" + E.getMessage());
                    }

                    Random random = new Random();
                    int id = random.nextInt(999999);
                    registrationId.setText("Your Booking Id is " + id);
                }
            }
        });


        busBookingApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        busBookingApp.setLayout(null);
        busBookingApp.setResizable(false);
        busBookingApp.setVisible(true);
        busBookingApp.setBounds(400, 100, 400, 600);
    }
}
