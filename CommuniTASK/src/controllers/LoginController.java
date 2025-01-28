package controllers;

//com.communitask.controllerss

//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.stage.Stage;
import java.io.IOException;
// import java.util.HashMap;

public class LoginController {
    // @FXML private TextField emailField;
    // @FXML private PasswordField passwordField;
    // @FXML private ChoiceBox<String> userType; // Dropdown for User/Admin selection
    // @FXML private Label loginMessage;
    
    //private static HashMap<String, String> users = new HashMap<>(); // Simulated user storage
    //private static HashMap<String, String> admins = new HashMap<>(); // Simulated admin storage

    public void initialize() {
        // userType.getItems().addAll("User", "Admin"); // Populating dropdown
        // userType.setValue("User"); // Default to "User"
    }

    //@FXML
    public void handleLogin() throws IOException {
        // String email = emailField.getText();
        // String password = passwordField.getText();
        // String role = userType.getValue(); // Get selected role

    //     if (role.equals("User") && users.containsKey(email) && users.get(email).equals(password)) {
    //         loadDashboard("user");
    //     } else if (role.equals("Admin") && admins.containsKey(email) && admins.get(email).equals(password)) {
    //         loadDashboard("admin");
    //     } else {
    //         loginMessage.setText("Invalid credentials. Please try again.");
    //     }
    // }

    // @FXML
    // public void goToRegister() throws IOException {
    //     Stage stage = (Stage) emailField.getScene().getWindow();
    //     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/communitask/views/register.fxml"));
    //     Scene scene = new Scene(fxmlLoader.load());
    //     stage.setScene(scene);
    // }

    // private void loadDashboard(String role) throws IOException {
    //     Stage stage = (Stage) emailField.getScene().getWindow();
    //     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/communitask/views/dashboard.fxml"));
    //     Scene scene = new Scene(fxmlLoader.load());
    //     stage.setScene(scene);

    //     DashboardController controller = fxmlLoader.getController();
    //     controller.setUserRole(role); // Pass role to Dashboard
    }


    // private void loadDashboard() {
    //     try {
    //         FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Dashboard.fxml"));
    //         Parent root = loader.load();
    //         Stage stage = (Stage) loginButton.getScene().getWindow();
    //         stage.setScene(new Scene(root));
    //         stage.setTitle("Dashboard");
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }    
}



//Option 2 for Authentication
// package controllers;

// import javafx.fxml.FXML;
// import javafx.scene.control.TextField;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.Label;
// import login.DatabaseHandler;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// public class LoginController {

//     @FXML
//     private TextField emailField;
//     @FXML
//     private PasswordField passwordField;
//     @FXML
//     private Label errorLabel;

//     public void handleLogin() {
//         String email = emailField.getText();
//         String password = passwordField.getText();

//         String selectUserSQL = "SELECT * FROM users WHERE email = ? AND password = ?;";

//         try (Connection conn = DatabaseHandler.getConnection();
//              PreparedStatement pstmt = conn.prepareStatement(selectUserSQL)) {

//             pstmt.setString(1, email);
//             pstmt.setString(2, password);
//             ResultSet rs = pstmt.executeQuery();

//             if (rs.next()) {
//                 System.out.println("Login successful! Welcome, " + rs.getString("first_name") + ".");
//                 // TODO: Switch Scene to Dashboard
//             } else {
//                 errorLabel.setText("Invalid email or password. Please try again.");
//             }
//         } catch (SQLException e) {
//             errorLabel.setText("Database Error: " + e.getMessage());
//         }
//     }
// }

