package UI;

import DL.FetchFlights;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by andrew on 11.06.17.
 */
public class Main {

    private JFrame frame;
    private GridBagConstraints c;
    private  JPanel panel;

    public void doMainWindow() {

        frame = new JFrame();
        frame.setSize(1024, 768);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        panel = new JPanel(new GridBagLayout());
        panel.setSize(1000,700);
        frame.add(panel);

        frame.setVisible(true);


    }

    public void doHeader() {

        c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(10,0,10,0);
        JLabel invitationText = new JLabel("Welcome to Sunrise Airport!", SwingConstants.CENTER);

        panel.add(invitationText, c);

    }

    public void doTable() {

//        do table
        String[] columnNames = {"Flight",
                "Destination",
                "Depature",
                "Terminal",
                "Status"};


        Object[][] data = FetchFlights.getArrivals();
        JTable table = new JTable(data, columnNames);
        table.setPreferredSize(new Dimension(700,400));

//        do a tabbed panel
        c.gridx = 1;
        c.gridy = 1;
        c.ipadx = 20;
        c.ipady = 60;

        JTabbedPane tabbedPane = new JTabbedPane();
        JComponent panel1 = new JPanel();
        tabbedPane.addTab("                Arrival                ", panel1);
        panel1.add(table);

        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = new JPanel();
        tabbedPane.addTab("                 Depature              ", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        panel.add(tabbedPane, c);


    }

    public void doSidebar() {

//        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(0,10,0,10);

//        do a left sidebar



        JPanel sideBar = new JPanel(new GridBagLayout());
//        sideBar.setMinimumSize(new Dimension(200,80));
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel title = new JLabel("Please, login");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;

        gbc.insets = new Insets(0,0,10, 0);

        sideBar.add(title,gbc);

        JLabel label1 = new JLabel("Login:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipadx = 20;
        gbc.gridwidth = 1;

        label1.setPreferredSize(new Dimension(60,20));
        sideBar.add(label1, gbc);

        JTextField loginField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 20;


        sideBar.add(loginField,gbc);

        JLabel label2 = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        sideBar.add(label2,gbc);

        JPasswordField passwordField = new JPasswordField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 20;

        sideBar.add(passwordField,gbc);

        panel.add(sideBar, c);


    }

    public void doFooter() {

        JLabel jLabel = new JLabel("created by Andrew Sotnikov, 2017", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        panel.add(jLabel,c);

    }

    public static void main(String[] args) {

        Main window = new Main();
        window.doMainWindow();
        window.doHeader();
        window.doSidebar();
        window.doTable();
        window.doFooter();

        window.frame.validate();
    }

}
