package login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class UserRegistration {
    public static void registerUser(Scanner scanner) {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name (optional): ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        String insertUserSQL = "INSERT INTO users (first_name, middle_name, last_name, email, password) VALUES (?, ?, ?, ?, ?);";

        try (Connection conn = DatabaseHandler.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertUserSQL)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, middleName.isEmpty() ? null : middleName);
            pstmt.setString(3, lastName);
            pstmt.setString(4, email);
            pstmt.setString(5, password);
            pstmt.executeUpdate();

            System.out.println("User registered successfully.");
        } catch (SQLException e) {
            if (e.getMessage().contains("UNIQUE constraint failed")) {
                System.out.println("Email already exists. Please try a different one.");
            } else {
                System.out.println("Error registering user: " + e.getMessage());
            }
        }
    }
}
