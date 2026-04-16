package Lab2;

import javax.swing.*;
import java.awt.event.*;

public class q21MenuDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        open.addActionListener(e -> JOptionPane.showMessageDialog(f, "Open"));
        exit.addActionListener(e -> System.exit(0));

        edit.add(new JCheckBoxMenuItem("Cut"));
        edit.add(new JCheckBoxMenuItem("Copy"));

        file.add(open);
        file.add(edit);
        file.add(exit);

        mb.add(file);
        f.setJMenuBar(mb);

        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50, 100, 300, 30);

        f.add(info);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}