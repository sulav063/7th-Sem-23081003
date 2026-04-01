package Lab3;

import java.sql.*;
import java.util.Scanner;

public class q29InsertFromConsole {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","");

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO student VALUES("+id+",'"+name+"',"+marks+")");

            System.out.println("Inserted Successfully");

            con.close();

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch(Exception e){ e.printStackTrace(); }
    }
}