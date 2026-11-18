package com.example;

public class RegistrationValidation {

    public static void main(String[] args) {

        String name = "Sasini";
        String email = "sasini@gmail.com";
        String password = "123456";

        if (name.equals("")) {

            System.out.println("Please enter your name");

        } else if (email.equals("")) {

            System.out.println("Please enter your email");

        } else if (!email.contains("@") || !email.contains(".")) {

            System.out.println("Please enter a valid email");

        } else if (password.equals("")) {

            System.out.println("Please enter your password");

        } else if (password.length() < 6) {

            System.out.println("Password must contain at least 6 characters");

        } else {

            System.out.println("Registration successful");
        }
    }
}