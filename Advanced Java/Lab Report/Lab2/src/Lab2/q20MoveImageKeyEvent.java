package Lab2;

import javax.swing.*;
import java.awt.event.*;

public class q20MoveImageKeyEvent {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        JLabel img = new JLabel(new ImageIcon("C:\\Users\\Acer\\Downloads\\sulav.jpg"));
        img.setBounds(100, 100, 100, 100);

        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50, 200, 300, 30);

        f.addKeyListener(new KeyAdapter() {
            int x = 100, y = 100;

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) { x -= 10; System.out.println("Left"); }
                if (e.getKeyCode() == 39) { x += 10; System.out.println("Right"); }
                if (e.getKeyCode() == 38) { y -= 10; System.out.println("Up"); }
                if (e.getKeyCode() == 40) { y += 10; System.out.println("Down"); }

                img.setBounds(x, y, 100, 100);
            }
        });

        f.add(img);
        f.add(info); // ✅ added
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.requestFocus();
    }
}