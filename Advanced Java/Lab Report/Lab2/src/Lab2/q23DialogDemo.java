package Lab2;

import javax.swing.*;

public class q23DialogDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Dialog");

        JButton modal = new JButton("Modal");
        JButton modeless = new JButton("Modeless");

        modal.setBounds(30,50,100,30);
        modeless.setBounds(150,50,100,30);

        modal.addActionListener(e -> {
            JDialog d = new JDialog(f,"Modal",true);
            d.setSize(200,100);
            d.setVisible(true);
        });

        modeless.addActionListener(e -> {
            JDialog d = new JDialog(f,"Modeless",false);
            d.setSize(200,100);
            d.setVisible(true);
        });

        f.add(modal); f.add(modeless);

        f.setSize(300,200);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}