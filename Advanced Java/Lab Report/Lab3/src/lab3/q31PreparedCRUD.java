package Lab3;

import java.sql.*;

public class q31PreparedCRUD {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","");

            // INSERT
            PreparedStatement ps1 = con.prepareStatement(
                "INSERT INTO student VALUES(?,?,?)");
            ps1.setInt(1,5);
            ps1.setString(2,"Ram");
            ps1.setInt(3,90);
            ps1.executeUpdate();

            // UPDATE
            PreparedStatement ps2 = con.prepareStatement(
                "UPDATE student SET marks=? WHERE id=?");
            ps2.setInt(1,95);
            ps2.setInt(2,5);
            ps2.executeUpdate();

            // DELETE
            PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM student WHERE id=?");
            ps3.setInt(1,5);
            ps3.executeUpdate();

            // SELECT
            PreparedStatement ps4 = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = ps4.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            con.close();

        } catch(Exception e){ e.printStackTrace(); }
    }
}