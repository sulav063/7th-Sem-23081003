package Lab2;
import javax.swing.*;
import java.awt.*;

public class q16GridBagLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("GridBag Layout");
        f.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();

        g.gridx = 0; g.gridy = 0;
        f.add(new JButton("A"), g);

        g.gridx = 1;
        f.add(new JButton("B"), g);

        g.gridx = 0; g.gridy = 1;
        JButton exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));
        f.add(exit, g);
        
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setSize(300,200);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}