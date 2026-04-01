package Lab2;

import javax.swing.*;

public class q17AnonymousEvent {
    public static void main(String[] args) {

        JFrame f = new JFrame("Anonymous");

        JButton b = new JButton("Click");
        b.setBounds(50,50,100,30);

        b.addActionListener(e ->
            JOptionPane.showMessageDialog(f, "Clicked")
        );

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