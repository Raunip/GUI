package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ModifyRervavtionSubMenu {
    private static JTextField first_name;
    private static JTextField last_name;
    private static JTextField check_in_date;
    private static JTextField check_out_date;
    private static JTextField room_type;
    private static JTextField room_rate;
    private static JTextField payment_method;
    private static JLabel numLabel;
    private static JPasswordField numText;
    private static JButton button;

    public static void main(String[] args) {

        //Title for window
        JFrame frame = new JFrame("Modify Reservation");

        JPanel panel = new JPanel();
        frame.setSize(400,800); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel first_name_label = new JLabel("First Name");
        first_name_label.setBounds(10,20,80,25);
        panel.add(first_name_label);

        JLabel last_name_label = new JLabel("Last Name");
        last_name_label.setBounds(10,50,80,25);
        panel.add(last_name_label);

        JLabel check_in_date_label = new JLabel("Check In Date");
        check_in_date_label.setBounds(10,80,80,25);
        panel.add(check_in_date_label);

        JLabel check_out_date_label = new JLabel("Check Out Date");
        check_out_date_label.setBounds(10,110,80,25);
        panel.add(check_out_date_label);

        JLabel room_type_label = new JLabel("Room Type");
        room_type_label.setBounds(10,140,80,25);
        panel.add(room_type_label);

        JLabel room_rate_label = new JLabel("Room Rate");
        room_rate_label.setBounds(10,170,80,25);
        panel.add(room_rate_label);

        JLabel payment_method_label = new JLabel("Payment Method");
        payment_method_label.setBounds(10,200,80,25);
        panel.add(payment_method_label);

        //allows user to insert a text
        first_name = new JTextField();
        first_name.setBounds(170,20,140,25);
        panel.add(first_name);

        last_name = new JTextField();
        last_name_label.setBounds(170,50,140,25);
        panel.add(last_name);

        check_in_date = new JTextField();
        check_in_date.setBounds(170,80,140,25);
        panel.add(check_in_date);

        check_out_date = new JTextField();
        check_out_date.setBounds(170,110,140,25);
        panel.add(check_out_date);

        room_type = new JTextField();
        room_rate.setBounds(170,50,140,25);
        panel.add(room_type);

        room_rate = new JTextField();
        room_rate.setBounds(170,50,170,25);
        panel.add(room_rate);

        payment_method = new JTextField();
        payment_method.setBounds(170,50,200,25);
        panel.add(payment_method);

        button = new JButton("Back");
        button.setBounds(10,240,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        button = new JButton("Find");
        button.setBounds(150,240,80,25);
        button.addActionListener(new GUI());
        panel.add(button);


        panel.setBackground(new Color(0, 119, 200)); //RGB code for background
        frame.setVisible(true);


    }





}
