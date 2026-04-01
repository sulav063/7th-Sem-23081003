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
                "jdbc:mysql://localhost:3306/lab3db","root","");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT * FROM result WHERE roll_no="+roll
            );

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            con.close();

        } catch(Exception e){ e.printStackTrace(); }
    }
}