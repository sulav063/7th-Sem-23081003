package Lab2;

import javax.swing.*;
import java.awt.event.*;

public class q21MenuDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Menu Demo");

        // ===== Menu Bar =====
        JMenuBar mb = new JMenuBar();

        // ===== File Menu =====
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        // ===== Menu Items =====
        JMenuItem open = new JMenuItem("Open");
        open.setMnemonic(KeyEvent.VK_O);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        open.setIcon(new ImageIcon("open.png")); // icon

        JMenuItem save = new JMenuItem("Save");
        save.setEnabled(false); // disabled item

        JMenuItem exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_E);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        // ===== Submenu =====
        JMenu edit = new JMenu("Edit");

        JCheckBoxMenuItem cut = new JCheckBoxMenuItem("Cut");
        JCheckBoxMenuItem copy = new JCheckBoxMenuItem("Copy");

        // ===== Radio Button Menu Items =====
        JRadioButtonMenuItem light = new JRadioButtonMenuItem("Light Mode");
        JRadioButtonMenuItem dark = new JRadioButtonMenuItem("Dark Mode");

        ButtonGroup bg = new ButtonGroup();
        bg.add(light);
        bg.add(dark);

        // ===== Action Event =====
        open.addActionListener(e -> JOptionPane.showMessageDialog(f, "Open Clicked"));

        exit.addActionListener(e -> System.exit(0));

        // ===== Adding Items =====
        edit.add(cut);
        edit.add(copy);
        edit.addSeparator();
        edit.add(light);
        edit.add(dark);

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(edit); // submenu
        file.addSeparator();
        file.add(exit);

        // ===== Add Menu to Bar =====
        mb.add(file);
        f.setJMenuBar(mb);

        // ===== Frame Settings =====
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        f.add(info);

        f.setSize(400, 300);
        f.setLayout(null);
        info.setBounds(50, 100, 300, 30);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}