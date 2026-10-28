import java.sql.*;

public class a {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/PPA55";
        String user = "root";
        String password = "Aditya@99";

        try {
            // Connect to database
            Connection con = DriverManager.getConnection(
                url, user, password
            );

            System.out.println("Database connected successfully!");

            // Create statement
            Statement st = con.createStatement();

            // Execute SQL command
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            // Display records
            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " + rs.getString(2)
                );
            }

            // Close connection
            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}