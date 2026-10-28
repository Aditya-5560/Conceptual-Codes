import java.sql.*;

public class MarvellousJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/PPA55",
                "root",
                "Aditya@99"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("RollNo"));
                System.out.println("Name   : " + rs.getString("Name"));
                System.out.println("City   : " + rs.getString("City"));
                System.out.println("Marks  : " + rs.getInt("Marks"));
                System.out.println("----------------------------");
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}

//Compile
//javac -cp ".:mysql-connector-j-26.7.0.jar" MarvellousJDBC.java

//Run
//javac -cp ".:mysql-connector-j-26.7.0.jar" MarvellousJDBC.java