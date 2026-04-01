package Lab2;

import javax.swing.*;
import java.awt.event.*;

class Handler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Handled");
    }
}

public class q17AnotherClassEvent {
    public static void main(String[] args) {

        JFrame f = new JFrame("Another Class");

        JButton b = new JButton("Click");
        b.setBounds(50,50,100,30);
        b.addActionListener(new Handler());

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

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}
