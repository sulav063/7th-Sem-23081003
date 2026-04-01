package Lab2;
import javax.swing.*;

public class q16GroupLayoutDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Group Layout");
        JButton b1 = new JButton("A");
        JButton exit = new JButton("Exit");

        exit.addActionListener(e -> System.exit(0));

        GroupLayout layout = new GroupLayout(f.getContentPane());
        f.setLayout(layout);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(b1)
                .addComponent(exit)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(b1)
                .addComponent(exit)
        );

        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setSize(300,200);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}