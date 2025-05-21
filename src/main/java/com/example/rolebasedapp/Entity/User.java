package com.example.rolebasedapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Tells Spring this class should map to a table
public class User {

    @Id // This field will be the Primary Key (unique ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Tells the database to auto-generate the ID when saving a new user.
    private Long id; // Auto-increment ID from database

    private String username; // Column for username
    private String password; // Column for password (encrypted later)
    private String role;     // Column for user role (like ROLE_USER or ROLE_ADMIN)

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
