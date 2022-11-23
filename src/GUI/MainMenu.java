package GUI;

import javax.swing.*;
import java.awt.*;


public class MainMenu  {
    private static JButton res_button;
    private static JButton find_roomsButton;
    private  static JButton check_inButton;
    private  static JButton check_outButton;
    private static String reservation = new String("Reservation");
    private static String avail_rooms = new String("Find Available Rooms");
    private static String check_in = new String("Check In");
    private static String check_out = new String("Check Out");


    public static void main (String[] args){
        JFrame frame = new JFrame("Main Menu");
        frame.setSize(300, 400);
        frame.setLayout(null);

        res_button = new JButton(reservation);
        res_button.setBounds(90, 40, 100, 40);

        find_roomsButton = new JButton(avail_rooms);
        find_roomsButton.setBounds(90,100,100,40);

        check_inButton = new JButton(check_in);
        check_inButton.setBounds(90,160,100,40);

        check_outButton = new JButton(check_out);
        check_outButton.setBounds(90,220,100,40);

        frame.add(res_button);
        frame.add(find_roomsButton);
        frame.add(check_inButton);
        frame.add(check_outButton);
        frame.setBackground(new Color(0, 200, 160));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




}