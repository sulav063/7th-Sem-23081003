package Lab3;

import java.sql.*;

public class q36TransactionDemo {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab3db","root","Mp40awm@#");

            con.setAutoCommit(false); // Start transaction

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO student VALUES(10,'A',70)");
            st.executeUpdate("INSERT INTO student VALUES(11,'B',75)");

            con.commit(); // Save changes

            System.out.println("Transaction Success");

            con.close();

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}