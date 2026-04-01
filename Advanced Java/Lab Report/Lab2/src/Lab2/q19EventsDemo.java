package Lab2;

import javax.swing.*;
import java.awt.event.*;

public class q19EventsDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Events");

        JTextField tf = new JTextField();
        tf.setBounds(50,50,150,30);

        tf.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                System.out.println("Focus gained");
            }
        });

        tf.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                System.out.println("Key pressed");
            }
        });

        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked");
            }
        });

        f.add(tf);

        f.setSize(300,200);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}