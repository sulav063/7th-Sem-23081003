package Lab2;

import javax.swing.*;
import java.awt.*;

public class q15AllComponentsGUI {
    public static void main(String[] args) {

        JFrame f = new JFrame("Q15 Components");
        f.setSize(400, 450);
        f.setLayout(null);

        // Label
        JLabel l = new JLabel("Name: Sulav Adhikari");
        l.setBounds(20, 20, 200, 30);
        f.add(l);

        // TextField
        JTextField tf = new JTextField();
        tf.setBounds(20, 60, 150, 25);
        tf.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        tf.setToolTipText("Enter text");
        f.add(tf);

        // Password
        JPasswordField pf = new JPasswordField();
        pf.setBounds(20, 100, 150, 25);
        f.add(pf);

        // TextArea + Scroll
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(20, 140, 200, 80);
        f.add(sp);

        // Checkbox
        JCheckBox cb = new JCheckBox("Accept");
        cb.setBounds(20, 230, 100, 25);
        f.add(cb);

        // Radio
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        r1.setBounds(20, 260, 80, 25);
        r2.setBounds(100, 260, 80, 25);
        f.add(r1); f.add(r2);

        // Combo
        JComboBox<String> c = new JComboBox<>(new String[]{"Nepal","India"});
        c.setBounds(20, 290, 100, 25);
        f.add(c);

        // Exit button
        JButton exit = new JButton("Exit");
        exit.setBounds(20, 330, 100, 30);
        exit.addActionListener(e -> System.exit(0));
        f.add(exit);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}