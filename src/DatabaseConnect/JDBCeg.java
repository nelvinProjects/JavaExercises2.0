package DatabaseConnect;

import java.sql.*;

public class JDBCeg {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";

    static final String USER = "root";
    static final String PASS = "1313";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from actor");

            while (rs.next()) {
                System.out.println(rs.getString(2)+ " "+ rs.getString(3));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
