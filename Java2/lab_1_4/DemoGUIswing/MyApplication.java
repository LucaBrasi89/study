package lab_1_4.DemoGUIswing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;

/**
 * Created by andrew on 07.05.17.
 */
public class MyApplication extends JFrame {

    private JFrame frame;
    private String name;

    public MyApplication(String name) throws HeadlessException {

        frame = new JFrame(name);
        frame.setSize(640,480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public MyApplication(GraphicsConfiguration gc, String name) {
        super(gc);
        this.name = name;
    }

    public MyApplication(String title, String name) throws HeadlessException {
        super(title);
        this.name = name;
    }

    public MyApplication(String title, GraphicsConfiguration gc, String name) {
        super(title, gc);
        this.name = name;
    }


    public void createControlsRun() {

        String[] elements = { "calc", "terminal", "gedit"};

        GridBagLayout layout = new GridBagLayout();
        JPanel panel = new JPanel(layout);

        JLabel label = new JLabel("Run a Program:  ");
        JComboBox comboBox = new JComboBox(elements);
        JButton btn = new JButton("Run!");

        btn.setSize(20,40);

        frame.add(panel);
        panel.add(label);
        panel.add(comboBox);
        panel.add(btn);

        ;
        btn.addActionListener( e -> {
            String chosenItem = (String) comboBox.getSelectedItem();
            runApp(chosenItem);});




        frame.validate();

    }

    public void runApp(String chosenItem) {

        if (chosenItem.equals("terminal")) {
            try {
                Runtime.getRuntime().exec("/usr/bin/xfce4-terminal");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (chosenItem.equals("calc")) {
            try {
                Runtime.getRuntime().exec("/usr/bin/gnome-calculator");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (chosenItem.equals("gedit")) {
            try {
                Runtime.getRuntime().exec("/usr/bin/gedit");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {


        MyApplication myapp = new MyApplication("first GUI");
        myapp.createControlsRun();

    }
}
