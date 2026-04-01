package Lab2;

import javax.swing.*;

public class q21MenuDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Menu");

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        exit.addActionListener(e -> System.exit(0));

        file.add(open);
        file.add(exit);

        mb.add(file);
        f.setJMenuBar(mb);

        f.setSize(300,200);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}