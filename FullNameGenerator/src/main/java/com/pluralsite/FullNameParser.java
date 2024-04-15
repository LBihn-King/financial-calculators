package com.pluralsite;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    static String fullName;
    static String firstName;
    static String middleName = "N/A";
    static String lastName;

    private static void getName() {
        System.out.println("Enter full name as (first last) or (first middle last): ");
        fullName = scanner.nextLine().trim();
    }

    private static void parseName() {
        getName();
        String[] splitName = fullName.split(" ");
        int numberOfNames = splitName.length;
        if (numberOfNames == 2) {
            firstName = splitName[0];
            lastName = splitName[1];
        } else if (numberOfNames == 3) {
            firstName = splitName[0];
            middleName = splitName[1];
            lastName = splitName[2];
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("First name: " + firstName + "\nMiddle name: " + middleName + "\nLast name: " + lastName);
    }
    public static void main(String[] args) {
        parseName();
    }
}
