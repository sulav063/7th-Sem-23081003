package Lab2;
import javax.swing.*;
import java.awt.*;

public class q16BorderLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Border Layout");

        f.add(new JButton("North"), BorderLayout.NORTH);
        f.add(new JButton("South"), BorderLayout.SOUTH);
        f.add(new JButton("East"), BorderLayout.EAST);
        f.add(new JButton("West"), BorderLayout.WEST);

        JButton exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));
        f.add(exit, BorderLayout.CENTER);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setSize(300,200);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}