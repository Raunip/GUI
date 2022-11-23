
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class GUI implements ActionListener{

    private static JLabel namelabel;
    private static JTextField nameText;
    private static JLabel numLabel;
    private static JPasswordField numText;
    private static JButton button;

    public static void main(String[] args) {

        //Title for window
        JFrame frame = new JFrame("Find Reservation");

        JPanel panel = new JPanel();
        frame.setSize(350,200); //window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        namelabel = new JLabel("Name");
        namelabel.setBounds(10,20,80,25);
        panel.add(namelabel);

        //allows user to insert a text
        nameText = new JTextField();
        nameText.setBounds(170,20,140,25);
        panel.add(nameText);

        //label name asking for the confirmation number
        numLabel = new JLabel("Confirmation Number");
        numLabel.setBounds(10,50,150,25);
        panel.add(numLabel);

        numText = new JPasswordField();
        numText.setBounds(170,50,140,25);
        panel.add(numText);

        button = new JButton("Back");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        button = new JButton("Find");
        button.setBounds(150,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);


        panel.setBackground(new Color(0, 119, 200)); //RGB code for background
        frame.setVisible(true);


    }

    private static Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}