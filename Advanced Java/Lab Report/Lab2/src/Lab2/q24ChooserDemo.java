package Lab2;

import javax.swing.*;

public class q24ChooserDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Chooser");

        JButton file = new JButton("File");
        JButton color = new JButton("Color");

        file.setBounds(30,50,100,30);
        color.setBounds(150,50,100,30);

        file.addActionListener(e -> new JFileChooser().showOpenDialog(f));

        color.addActionListener(e -> JColorChooser.showDialog(f,"Pick",null));

        f.add(file); f.add(color);

        f.setSize(300,200);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}