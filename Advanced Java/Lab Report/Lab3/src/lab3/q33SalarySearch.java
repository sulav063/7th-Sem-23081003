package lab3;

import java.sql.*;
import java.util.Scanner;

public class q33SalarySearch {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Emp ID: ");
            int id = sc.nextInt();

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","Mp40awm@#");

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM salary WHERE emp_id=?");

            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            con.close();

        } catch(Exception e){ e.printStackTrace(); }
    }
}