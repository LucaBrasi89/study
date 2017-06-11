package UI;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Created by andrew on 11.06.17.
 */
public class Main {

    private JFrame frame;




    public void doMainWindow() {

        frame = new JFrame();
        frame.setSize(1024, 768);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        frame.add(tabbedPane);

        JComponent panel1 = new JPanel();
        tabbedPane.addTab("Arrival", panel1);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel2 = new JPanel();
        tabbedPane.addTab("Depature", panel2);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Main window = new Main();
        window.doMainWindow();

    }




}
