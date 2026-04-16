package Lab3;

import java.sql.*;
import java.util.Scanner;

public class q30DisplayByRoll {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db",
                "root",
                "Mp40awm@#"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM result WHERE roll_no=" + roll
            );

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("course_name") + " " +
                    rs.getInt("marks_obtained")
                );
            }

            if (!found) {
                System.out.println("No record found for Roll No: " + roll);
            }

            con.close();

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}