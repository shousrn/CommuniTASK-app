package models;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private String role; 

    // Constructor to initialize the user object
    public User(int userId, String name, String email, String password, String address, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.role = role; 
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Method to check if the provided credentials match the user
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
}

