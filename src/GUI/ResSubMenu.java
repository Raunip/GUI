package GUI;

import javax.swing.*;
import java.awt.*;

public class ResSubMenu {
    private static final String make_res = "Make Reservation";
    private static final String find_res = "Find Reservation";

    public static void main (String[] args){
        JFrame frame = new JFrame("Reservation Sub Menu");
        frame.setSize(350, 200);
        frame.setLayout(null);

        JButton make_resButton = new JButton(make_res);
        make_resButton.setBounds(90, 40, 100, 40);

        JButton find_resButton = new JButton(find_res);
        find_resButton.setBounds(90,100,100,40);

        frame.add(make_resButton);
        frame.add(find_resButton);
        frame.setBackground(new Color(0, 200, 160));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
