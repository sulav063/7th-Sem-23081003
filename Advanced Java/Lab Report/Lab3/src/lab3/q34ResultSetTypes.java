package Lab3;

import java.sql.*;

public class q34ResultSetTypes {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","");

            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE
            );

            // First ResultSet
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("Forward:");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            System.out.println("Backward:");
            while(rs.previous()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            // Updatable ResultSet
            rs.absolute(1);
            rs.updateString("name","UpdatedName");
            rs.updateRow();

            // Multiple ResultSet
            ResultSet rs2 = st.executeQuery("SELECT * FROM result");

            System.out.println("Second Table:");
            while(rs2.next()){
                System.out.println(rs2.getInt(1)+" "+rs2.getString(2));
            }

            con.close();

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch(Exception e){ e.printStackTrace(); }
    }
}