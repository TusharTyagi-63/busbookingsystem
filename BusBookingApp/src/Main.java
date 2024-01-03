import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JFrame busBookingApp = new JFrame("Bus Booking App");
        busBookingApp.setVisible(true);
        busBookingApp.setBounds(400, 100, 700, 600);


        JLabel name = new JLabel("Name");
        JLabel email = new JLabel("E-mail");
        JLabel mobile = new JLabel("Mobile");
        JLabel address = new JLabel("Address");
        JLabel source = new JLabel("Source");
        JLabel destination = new JLabel("Destination");
        JLabel payment = new JLabel("Payment");
        JLabel gender = new JLabel("Gender");

        for (JLabel jLabel : Arrays.asList(name, email,
                mobile, address, source, destination, payment, gender)) {
            jLabel.setVisible(true);
            jLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        }
        for (int i = 10; i <= 290; i++) {
            for (JLabel jLabel : Arrays.asList(name, email,
                    mobile, address, source, destination, payment, gender)) {
                jLabel.setBounds(10, i, 150, 30);
                i = i + 40;
            }
        }
        for (JLabel jLabel : Arrays.asList(name, email,
                mobile, address, source, destination, payment, gender)) {
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

        for (JTextField jTextField : Arrays.asList(name_tf, email_tf, mobile_tf, address_tf,
                source_tf, destination_tf, payment_tf, gender_tf)) {
            jTextField.setVisible(true);
            jTextField.setFont(new Font("Arial", Font.ITALIC, 20));
        }
        for (int i = 10; i <= 290; i++) {
            for (JTextField jTextField : Arrays.asList(name_tf, email_tf, mobile_tf, address_tf,
                    source_tf, destination_tf, payment_tf, gender_tf)) {
                jTextField.setBounds(130, i, 150, 30);
                i = i + 40;
            }
        }
        for (JTextField jTextField : Arrays.asList(name_tf, email_tf, mobile_tf, address_tf,
                source_tf, destination_tf, payment_tf, gender_tf)) {
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
            for (JButton jButton : Arrays.asList(book_bt, cancelBtn, exitBtn)) {
                jButton.setBounds(i, 330, 150, 30);
                i = i + 200;
            }
        }
        for (JButton jButton : Arrays.asList(book_bt, cancelBtn, exitBtn)) {
            busBookingApp.add(jButton);
        }


        busBookingApp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        busBookingApp.setLayout(null);
        busBookingApp.setResizable(false);
    }
}
