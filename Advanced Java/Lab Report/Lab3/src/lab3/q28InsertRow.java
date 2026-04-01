package Lab3;

import java.sql.*;

public class q28InsertRow {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","");

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO student VALUES(4,'Sita',88)");

            System.out.println("Inserted");

            con.close();

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch(Exception e){ e.printStackTrace(); }
    }
}