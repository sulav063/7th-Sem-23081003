package Lab2;
import javax.swing.*;
import java.awt.*;

public class q16FlowLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Flow Layout");
        f.setLayout(new FlowLayout());

        f.add(new JButton("A"));
        f.add(new JButton("B"));

        JButton exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));
        f.add(exit);

        f.setSize(300,200);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}