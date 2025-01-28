package controllers;
/* 
//package com.communitask.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;

public class RegisterController {
    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private ChoiceBox<String> userType;
    @FXML private Label registerMessage;

    public void initialize() {
        userType.getItems().addAll("User", "Admin");
        userType.setValue("User");
    }

    @FXML
    public void handleRegister() {
        String email = emailField.getText();
        String password = passwordField.getText();
        String role = userType.getValue();

        if (!email.isEmpty() && !password.isEmpty()) {
            if (role.equals("User")) {
                LoginController.users.put(email, password);
            } else {
                LoginController.admins.put(email, password);
            }
            registerMessage.setText("Registration successful! Go back to login.");
        } else {
            registerMessage.setText("Please fill in all fields.");
        }
    }

    @FXML
    public void goToLogin() throws IOException {
        Stage stage = (Stage) emailField.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/communitask/views/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
    }
}

*/

//Option 2

// package controllers;

// import javafx.fxml.FXML;
// import javafx.scene.control.TextField;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.Label;
// import login.DatabaseHandler;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// public class RegisterController {

//     @FXML
//     private TextField firstNameField, middleNameField, lastNameField, emailField;
//     @FXML
//     private PasswordField passwordField;
//     @FXML
//     private Label statusLabel;

//     public void handleRegister() {
//         String firstName = firstNameField.getText();
//         String middleName = middleNameField.getText();
//         String lastName = lastNameField.getText();
//         String email = emailField.getText();
//         String password = passwordField.getText();

//         String insertUserSQL = "INSERT INTO users (first_name, middle_name, last_name, email, password) VALUES (?, ?, ?, ?, ?);";

//         try (Connection conn = DatabaseHandler.getConnection();
//              PreparedStatement pstmt = conn.prepareStatement(insertUserSQL)) {

//             pstmt.setString(1, firstName);
//             pstmt.setString(2, middleName.isEmpty() ? null : middleName);
//             pstmt.setString(3, lastName);
//             pstmt.setString(4, email);
//             pstmt.setString(5, password);
//             pstmt.executeUpdate();

//             statusLabel.setText("User registered successfully.");
//         } catch (SQLException e) {
//             if (e.getMessage().contains("UNIQUE constraint failed")) {
//                 statusLabel.setText("Email already exists. Please try another.");
//             } else {
//                 statusLabel.setText("Error: " + e.getMessage());
//             }
//         }
//     }
// }
