// package controllers;

// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;
// import javafx.scene.Node;
// import javafx.event.ActionEvent;
// import java.io.IOException;

// public class DashboardController {
    
//     private Stage stage;
//     private Scene scene;
//     private Parent root;

//     Method to switch scenes
//     public void switchToScene(ActionEvent event, String fxmlFile) throws IOException {
//         root = FXMLLoader.load(getClass().getResource("/gui/" + fxmlFile)); // Load the FXML file
//         stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); // Get current stage
//         scene = new Scene(root);
//         stage.setScene(scene);
//         stage.show();
//     }

//     // Event handlers for navigation buttons
//     public void goToHome(ActionEvent event) throws IOException {
//         switchToScene(event, "home.fxml");
//     }

//     public void goToNotifications(ActionEvent event) throws IOException {
//         switchToScene(event, "notification.fxml");
//     }

//     public void goToConcerns(ActionEvent event) throws IOException {
//         switchToScene(event, "concerns.fxml");
//     }

//     public void goToProfile(ActionEvent event) throws IOException {
//         switchToScene(event, "profile.fxml");
//     }
// }


//Logout Function
// @FXML
// private void logout() throws IOException {
//     FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
//     Stage stage = (Stage) homeButton.getScene().getWindow();
//     stage.setScene(new Scene(loader.load()));
//     stage.show();
// }



//Option 2
// package controllers;

// import javafx.fxml.FXML;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;
// import java.io.IOException;

// public class DashboardController {

//     @FXML
//     private void switchToHome() throws IOException {
//         switchScene("home.fxml");
//     }

//     @FXML
//     private void switchToNotifications() throws IOException {
//         switchScene("notifications.fxml");
//     }

//     @FXML
//     private void switchToConcerns() throws IOException {
//         switchScene("concerns.fxml");
//     }

//     @FXML
//     private void switchToProfile() throws IOException {
//         switchScene("profile.fxml");
//     }

//     private void switchScene(String fxmlFile) throws IOException {
//         Stage stage = (Stage) emailField.getScene().getWindow(); // Get current window
//         Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
//         stage.setScene(new Scene(root));
//         stage.show();
//     }
// }


