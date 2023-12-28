package ISSTask1;

//Point 11: JDBC
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
 public static void main(String[] args) {
     try {
         // Connecting to the database
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

         // Creating a statement
         Statement statement = connection.createStatement();

         // Executing a query
         ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

         // Displaying the results
         while (resultSet.next()) {
             System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));
         }

         // Closing resources
         resultSet.close();
         statement.close();
         connection.close();
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

