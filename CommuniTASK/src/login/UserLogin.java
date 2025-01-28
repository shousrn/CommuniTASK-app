package login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserLogin {
    public static void loginUser(Scanner scanner) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        String selectUserSQL = "SELECT * FROM users WHERE email = ? AND password = ?;";

        try (Connection conn = DatabaseHandler.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectUserSQL)) {

            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful! Welcome, " + rs.getString("first_name") + " " + rs.getString("last_name") + ".");
            } else {
                System.out.println("Invalid email or password. Please try again.");
            }
        } catch (SQLException e) {
            System.out.println("Error logging in: " + e.getMessage());
        }
    }
}


//GUI implementation

// public class UserLogin {
//     public static boolean loginUser(String email, String password) {
//         try {
//             Connection conn = DatabaseHandler.getConnection();
//             String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
//             PreparedStatement stmt = conn.prepareStatement(sql);
//             stmt.setString(1, email);
//             stmt.setString(2, password);
//             ResultSet rs = stmt.executeQuery();

//             if (rs.next()) {
//                 System.out.println("Login successful! Welcome, " + rs.getString("name"));
//                 return true;
//             } else {
//                 return false;
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//             return false;
//         }
//     }
// }
