package Lab2;
import javax.swing.*;
import java.awt.*;

public class q16GridLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Grid Layout");
        f.setLayout(new GridLayout(2,2));

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));

        JButton exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));
        f.add(exit);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setSize(300,200);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}