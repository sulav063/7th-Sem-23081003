package Lab3;

import java.sql.*;
import java.util.Scanner;

public class q32LoopInsert {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","");

            Scanner sc = new Scanner(System.in);
            String choice;

            do {
                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Marks: ");
                int marks = sc.nextInt();

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO student VALUES(?,?,?)");

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setInt(3,marks);

                ps.executeUpdate();

                System.out.print("Continue? (y/n): ");
                choice = sc.next();

            } while(choice.equalsIgnoreCase("y"));

            con.close();

        } catch(Exception e){ e.printStackTrace(); }
    }
}