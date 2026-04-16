package lab3;

import javax.swing.*;
import java.sql.*;

public class q37SwingCRUD {

    public static void main(String[] args) {

        JFrame f = new JFrame("CRUD Application");

        // ===== Labels =====
        JLabel l1 = new JLabel("ID:");
        JLabel l2 = new JLabel("Name:");
        JLabel l3 = new JLabel("Marks:");

        // ===== Footer Label (INSIDE FRAME) =====
        JLabel footer = new JLabel("Lab 3, Sulav Adhikari, 23081003");

        // ===== Text Fields =====
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        // ===== Set Bounds =====
        l1.setBounds(50, 50, 80, 30);
        t1.setBounds(120, 50, 150, 30);

        l2.setBounds(50, 100, 80, 30);
        t2.setBounds(120, 100, 150, 30);

        l3.setBounds(50, 150, 80, 30);
        t3.setBounds(120, 150, 150, 30);

        footer.setBounds(80, 250, 250, 30);

        // ===== Buttons =====
        JButton add = new JButton("Insert");
        JButton show = new JButton("Show");

        add.setBounds(50, 200, 100, 30);
        show.setBounds(160, 200, 100, 30);

        // ===== INSERT =====
        add.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab3db",
                    "root",
                    "Mp40awm@#"
                );

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student VALUES(?,?,?)"
                );

                ps.setInt(1, Integer.parseInt(t1.getText()));
                ps.setString(2, t2.getText());
                ps.setInt(3, Integer.parseInt(t3.getText()));

                ps.executeUpdate();

                JOptionPane.showMessageDialog(f, "Inserted Successfully");

                con.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // ===== SHOW =====
        show.addActionListener(e -> {
            try {
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lab3db",
                    "root",
                    "Mp40awm@#"
                );

                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery("SELECT * FROM student");

                StringBuilder data = new StringBuilder();

                while (rs.next()) {
                    data.append(rs.getInt(1))
                        .append(" ")
                        .append(rs.getString(2))
                        .append(" ")
                        .append(rs.getInt(3))
                        .append("\n");
                }

                JOptionPane.showMessageDialog(f, data.toString());

                con.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // ===== Add Components =====
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(add);
        f.add(show);
        f.add(footer);   // ✔ INSIDE FRAME

        f.setSize(350, 320);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}