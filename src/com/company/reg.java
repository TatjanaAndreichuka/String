package com.company;

public class reg {
    public static void main(String[] args) {
        String name = "John";
        if (name.matches("[a-zA-Z]+")) {
            System.out.println("The name is " + name);
        } else {
            System.out.println(name +" is not a name");
        }

        String username = "s20surname";
        if (username.matches("[a-zA-Z]{1}[0-9]{2}[a-zA-Z]+")) {
            System.out.println("The username accepted");
        } else {
            System.out.println("Access denied");
        }

        String personCodeOfLatvian = "121200-11311";
        if (personCodeOfLatvian.matches("[0-9]{6}[-][0-9]{5}")) {
            System.out.println("The PC accepted");
        } else {
            System.out.println("The PC denied");
        }
        }
    }


