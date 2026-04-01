package Lab2;

import javax.swing.*;
import java.awt.event.*;

public class q20MoveImageKeyEvent {
    public static void main(String[] args) {

        JFrame f = new JFrame("Move");

        JLabel img = new JLabel("O");
        img.setBounds(100,100,50,50);

        f.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                int x = img.getX();
                int y = img.getY();

                if(e.getKeyCode()==KeyEvent.VK_LEFT) x-=10;
                if(e.getKeyCode()==KeyEvent.VK_RIGHT) x+=10;
                if(e.getKeyCode()==KeyEvent.VK_UP) y-=10;
                if(e.getKeyCode()==KeyEvent.VK_DOWN) y+=10;

                img.setBounds(x,y,50,50);
            }
        });

        f.add(img);
        f.setSize(300,300);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}