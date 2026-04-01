package Lab2;

import javax.swing.*;

public class q25InternalFrameDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Internal Frame");
        JDesktopPane dp = new JDesktopPane();

        JInternalFrame i = new JInternalFrame("Inner", true,true,true,true);
        i.setSize(200,150);
        i.setVisible(true);

        dp.add(i);
        f.add(dp);

        f.setSize(300,300);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}