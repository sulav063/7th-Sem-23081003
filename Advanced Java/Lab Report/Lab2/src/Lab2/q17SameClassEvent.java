package Lab2;

import javax.swing.*;
import java.awt.event.*;

public class q17SameClassEvent implements ActionListener {

    JFrame f;
    JButton b;

    q17SameClassEvent() {
        f = new JFrame("Same Class Event");

        b = new JButton("Click");
        b.setBounds(50,50,100,30);
        b.addActionListener(this);

        JButton exit = new JButton("Exit");
        exit.setBounds(50,100,100,30);
        exit.addActionListener(e -> System.exit(0));

        f.add(b); f.add(exit);
        f.setSize(250,200);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f, "Button Clicked");
    }

    public static void main(String[] args) {
        new q17SameClassEvent();
        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}