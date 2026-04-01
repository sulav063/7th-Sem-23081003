package Lab2;

import javax.swing.*;

public class q18CalculatorGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel res = new JLabel("Result");

        t1.setBounds(20,20,100,30);
        t2.setBounds(140,20,100,30);
        res.setBounds(20,60,200,30);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton exit = new JButton("Exit");

        add.setBounds(20,100,50,30);
        sub.setBounds(80,100,50,30);
        mul.setBounds(140,100,50,30);
        exit.setBounds(80,140,80,30);

        add.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result: " + (a+b));
        });

        sub.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result: " + (a-b));
        });

        mul.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            res.setText("Result: " + (a*b));
        });

        exit.addActionListener(e -> System.exit(0));

        f.add(t1); f.add(t2); f.add(res);
        f.add(add); f.add(sub); f.add(mul); f.add(exit);

        f.setSize(300,250);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}