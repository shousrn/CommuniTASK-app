package main;
import java.util.Scanner;

import login.*;

    public class Main {
        public static void main(String[] args) {
            
            DatabaseHandler.initializeDatabase();
    
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n=== CommuniTASK ===");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
    
                int choice = scanner.nextInt();
                scanner.nextLine(); 
    
                switch (choice) {
                    case 1:
                        UserRegistration.registerUser(scanner);
                        break;
                    case 2:
                        UserLogin.loginUser(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }


    //GUI implementation
    // public class Main extends Application {
    //     @Override
    //     public void start(Stage primaryStage) {
    //         try {
    //             Parent root = FXMLLoader.load(getClass().getResource("/gui/Login.fxml"));
    //             primaryStage.setScene(new Scene(root));
    //             primaryStage.setTitle("CommuniTASK - Login");
    //             primaryStage.show();
    //         } catch (IOException e) {
    //             e.printStackTrace();
    //         }
    //     }
    
    //     public static void main(String[] args) {
    //         launch(args);
    //     }
    // }
    

//Option 2
// package main;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// public class Main extends Application {

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/login.fxml"))));
//         primaryStage.setTitle("CommuniTASK");
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
