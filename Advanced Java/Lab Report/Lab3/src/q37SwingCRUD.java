package Lab3;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class q37SwingCRUD {

    public static void main(String[] args) {

        JFrame f = new JFrame("CRUD Application");

        JTextField t1 = new JTextField(); // ID
        JTextField t2 = new JTextField(); // Name
        JTextField t3 = new JTextField(); // Marks

        t1.setBounds(50,50,150,30);
        t2.setBounds(50,100,150,30);
        t3.setBounds(50,150,150,30);

        JButton add = new JButton("Insert");
        JButton show = new JButton("Show");

        add.setBounds(50,200,100,30);
        show.setBounds(160,200,100,30);

        // INSERT
        add.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab3db","root","Mp40awm@#");

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student VALUES(?,?,?)");

                ps.setInt(1,Integer.parseInt(t1.getText()));
                ps.setString(2,t2.getText());
                ps.setInt(3,Integer.parseInt(t3.getText()));

                ps.executeUpdate();

                JOptionPane.showMessageDialog(f,"Inserted");

                con.close();

            } catch(Exception ex){ ex.printStackTrace(); }
        });

        // SHOW
        show.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab3db","root","");

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery("SELECT * FROM student");

                while(rs.next()){
                    System.out.println(
                        rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)
                    );
                }

                con.close();

            } catch(Exception ex){ ex.printStackTrace(); }
        });

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(add);
        f.add(show);

        f.setSize(350,300);
        f.setLayout(null);
        f.setVisible(true);

        System.out.println("Lab3, Sulav Adhikari, 23081003");
    }
}