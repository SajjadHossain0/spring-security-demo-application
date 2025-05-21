package com.example.rolebasedapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHash {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String rawPassword1 = "adminpass";
        String rawPassword2 = "userpass";

        String encrypted1 = encoder.encode(rawPassword1);
        String encrypted2 = encoder.encode(rawPassword2);

        System.out.println("Encrypted adminpass: " + encrypted1);
        System.out.println("Encrypted userpass: " + encrypted2);
    }
}

