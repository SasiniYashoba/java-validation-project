package com.example;

public class LoginValidation {

    public static void main(String[] args) {

        String username = "";
        String password = "12345";

        if (username.equals("")) {

            System.out.println("Please enter username");

        } else if (password.equals("")) {

            System.out.println("Please enter password");

        } else if (username.equals("sasini") && password.equals("12345")) {

            System.out.println("Login successful");

        } else {

            System.out.println("Invalid username or password");
        }
    }
}
