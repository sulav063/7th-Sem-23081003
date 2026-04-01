package Lab3;

import javax.sql.rowset.*;

public class q35RowSetDemo {
    public static void main(String[] args) {

        try {

            // JdbcRowSet
            JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();

            jrs.setUrl("jdbc:mysql://localhost:3306/lab3db");
            jrs.setUsername("root");
            jrs.setPassword("Mp40awm@#");

            jrs.setCommand("SELECT * FROM student");
            jrs.execute();

            System.out.println("JdbcRowSet:");
            while(jrs.next()){
                System.out.println(jrs.getInt(1)+" "+jrs.getString(2));
            }

            // CachedRowSet
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();

            crs.setUrl("jdbc:mysql://localhost:3306/lab3db");
            crs.setUsername("root");
            crs.setPassword("");

            crs.setCommand("SELECT * FROM student");
            crs.execute();

            System.out.println("CachedRowSet:");
            while(crs.next()){
                System.out.println(crs.getInt(1)+" "+crs.getString(2));
            }

            System.out.println("Lab3, Sulav Adhikari, 23081003");

        } catch(Exception e){ e.printStackTrace(); }
    }
}