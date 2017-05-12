package lab_1_4.DemoGuiSwing_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Created by sotnik on 08.05.17.
 */
public class MyApp extends JFrame {

    private String name;
    private JFrame frame;


    public MyApp(String name) {

        frame = new JFrame(name);
        frame.setSize(640, 240);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void createUserInput() {

        frame.setLayout(new GridLayout(4,1,100,10));

        GridBagLayout layout = new GridBagLayout();
//        PANEL one
        JPanel panel1 = new JPanel(layout);
        frame.add(panel1);
        JTextField textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension (240, 30));
        panel1.add(textField1);
        panel1.add(new JButton("Get_User_Name"));
        //        PANEL two
        JPanel panel2 = new JPanel(layout);
        frame.add(panel2);
        JLabel label1 = new JLabel("Result: ");
        panel2.add(label1);
        JTextField textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension (330, 30));
        panel2.add(textField2);

        //        PANEL three
        JPanel panel3 = new JPanel(layout);
        frame.add(panel3);
        JTextField textField3 = new JTextField();
        textField3.setPreferredSize(new Dimension (240, 30));
        panel3.add(textField3);
        panel3.add(new JButton("Get_Comp_Name"));

    }


    public void createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(240,20));
        frame.add(menuBar);
        //Build the first menu.
        JMenu menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);

        //a group of JMenuItems
        JMenuItem menuItem1 = new JMenuItem("Question",
                KeyEvent.VK_T);

        menu.add(menuItem1);
        //a group of JMenuItems
        JMenuItem menuItem2 = new JMenuItem("Input name",
                KeyEvent.VK_T);
        menuItem2.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem2);

    }

    public static void main(String[] args) {

        MyApp myapp = new MyApp("another GUI");
        myapp.createMenuBar();
        myapp.createUserInput();

        myapp.frame.validate();


    }


}



