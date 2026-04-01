package Lab2;

import javax.swing.*;

public class q22ComponentsDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Components");

        JSlider s = new JSlider();
        s.setBounds(50,20,200,50);

        JProgressBar pb = new JProgressBar();
        pb.setBounds(50,80,200,30);
        pb.setValue(50);

        String data[]={"A","B","C"};
        JList<String> list = new JList<>(data);
        list.setBounds(50,120,100,60);

        f.add(s); f.add(pb); f.add(list);

        f.setSize(300,250);
        f.setLayout(null);
        JLabel info = new JLabel("Lab2, Sulav Adhikari, 23081003");
        info.setBounds(50,200,300,30);
        f.add(info);
        f.setVisible(true);

        System.out.println("Lab2, Sulav Adhikari, 23081003");
    }
}