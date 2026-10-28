import java.sql.*;

public class Show {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/",
            "root",
            "Aditya@99"
        );

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SHOW DATABASES");

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
