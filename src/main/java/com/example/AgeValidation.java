package com.example;

public class AgeValidation {

    public static void main(String[] args) {

        int age = 22;

        if (age <= 0) {

            System.out.println("Please enter a valid age");

        } else if (age < 18) {

            System.out.println("You are not eligible");

        } else {

            System.out.println("You are eligible");
        }
    }
}