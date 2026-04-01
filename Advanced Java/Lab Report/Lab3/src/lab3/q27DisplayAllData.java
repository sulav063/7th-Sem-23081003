package Lab3;

import java.sql.*;

public class q27DisplayAllData {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","Mp40awm@#");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            con.close();

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch(Exception e){ e.printStackTrace(); }
    }
}