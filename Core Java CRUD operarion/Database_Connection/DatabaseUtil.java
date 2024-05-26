package Database_Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "furkan#.36alam"; // Replace with your MySQL password

    public static Connection getConnection() throws SQLException, SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
