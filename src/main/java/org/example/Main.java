package org.example;

import java.sql.SQLWarning;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        registration register = new registration();

        System.out.println("Enter your first name");
        register.setFirstName(scanner.nextLine());

        System.out.println("Enter your second name:");
        register.setSecondName(scanner.nextLine());

        System.out.println("Enter your date of birth (MM-DD-YYYY):");
        register.setDateOfBirth(scanner.nextLine());

        System.out.println("Enter your gender:");
        register.setGender(scanner.nextLine());

        System.out.println("Enter your phone number:");
        register.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter alternative phone number:");
        register.setAltPhoneNumber(scanner.nextLine());

        register.displayInfo();

        scanner.close();
    }
}