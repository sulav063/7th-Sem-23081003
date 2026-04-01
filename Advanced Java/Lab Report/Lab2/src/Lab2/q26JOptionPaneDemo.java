package Lab2;

import javax.swing.*;

public class q26JOptionPaneDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("JOptionPane Demo");
        f.setSize(400,300);
        f.setLayout(null);

        // Buttons
        JButton info = new JButton("Info");
        JButton error = new JButton("Error");
        JButton confirm = new JButton("Confirm");
        JButton input = new JButton("Input");
        JButton exit = new JButton("Exit");

        info.setBounds(30,30,100,30);
        error.setBounds(150,30,100,30);
        confirm.setBounds(30,80,100,30);
        input.setBounds(150,80,100,30);
        exit.setBounds(90,130,100,30);

        // Actions
        info.addActionListener(e ->
            JOptionPane.showMessageDialog(f,"Information Message")
        );

        error.addActionListener(e ->
            JOptionPane.showMessageDialog(f,"Error Message","Error",JOptionPane.ERROR_MESSAGE)
        );

        confirm.addActionListener(e ->
            JOptionPane.showConfirmDialog(f,"Are you sure?")
        );

        input.addActionListener(e ->
            JOptionPane.showInputDialog(f,"Enter your name")
        );

        exit.addActionListener(e -> System.exit(0));

        // Add buttons
        f.add(info); f.add(error);
        f.add(confirm); f.add(input);
        f.add(exit);

        // Lab info inside frame
        JLabel lab = new JLabel("Lab2, Sulav Adhikari, 23081003");
        lab.setBounds(50,200,300,30);
        f.add(lab);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}