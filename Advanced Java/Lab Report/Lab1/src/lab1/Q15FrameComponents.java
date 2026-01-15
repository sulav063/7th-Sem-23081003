package lab1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Q15FrameComponents {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Q15 Swing Components");
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Frame icon (logo)
        ImageIcon logo = new ImageIcon("logo.png"); // place any image in project folder
        frame.setIconImage(logo.getImage());

        // Label with icon
        JLabel iconLabel = new JLabel("Java", logo, JLabel.LEFT);
        iconLabel.setBounds(20, 10, 150, 40);
        frame.add(iconLabel);

        // Label with name
        JLabel nameLabel = new JLabel("Sulav Adhikari");
        nameLabel.setBounds(20, 50, 150, 20);
        frame.add(nameLabel);

        // Text field with colorful border & tooltip
        JTextField tf = new JTextField();
        tf.setBounds(20, 80, 200, 25);
        tf.setToolTipText("Enter text here");
        tf.setBorder(new LineBorder(Color.BLUE, 2));
        frame.add(tf);

        // Password field
        JPasswordField pf = new JPasswordField();
        pf.setBounds(20, 120, 200, 25);
        frame.add(pf);

        // Text area with scroll bars
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setBounds(20, 160, 250, 80);
        frame.add(sp);

        // Check box
        JCheckBox cb = new JCheckBox("Java");
        cb.setBounds(20, 250, 80, 20);
        frame.add(cb);

        // Radio buttons
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        rb1.setBounds(20, 280, 80, 20);
        rb2.setBounds(100, 280, 80, 20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        // Combo box
        String[] course = {"CSIT", "BCA", "BIM"};
        JComboBox<String> combo = new JComboBox<>(course);
        combo.setBounds(20, 310, 120, 25);
        frame.add(combo);

        // Push button
        JButton btn = new JButton("Submit");
        btn.setBounds(20, 350, 100, 30);
        frame.add(btn);

        // Footer (MANDATORY)
        JLabel footer = new JLabel("Lab1, Sulav Adhikari ,2381003");
        footer.setBounds(10, 420, 300, 20);
        frame.add(footer);

        frame.setVisible(true);
    }
}
