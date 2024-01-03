import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bus Booking App");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBounds(400,100,700,600);


        JLabel name = new JLabel("Name");
        JLabel email = new JLabel("E-mail");
        JLabel mobile = new JLabel("Mobile");
        JLabel address = new JLabel("Address");
        JLabel source = new JLabel("Source");
        JLabel destination = new JLabel("Destination");
        JLabel payment = new JLabel("Payment");
        JLabel gender= new JLabel("Gender");

        JTextField name_tf = new JTextField();
        JTextField email_tf = new JTextField();
        JTextField mobile_tf = new JTextField();
        JTextField address_tf = new JTextField();
        JTextField source_tf = new JTextField();
        JTextField destination_tf = new JTextField();
        JTextField payment_tf = new JTextField();
        JTextField gender_tf = new JTextField();

        JButton book_bt = new JButton("Book Now");
        JButton cancelBtn = new JButton("Cancel");
        JButton exitBtn = new JButton("Exit");

        
    }
}
