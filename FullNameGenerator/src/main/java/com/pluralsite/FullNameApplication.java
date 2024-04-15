package com.pluralsite;
import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    static String firstName;
    static String lastName;
    static String middleName;
    static String suffix;
    static String fullName;

    private static void getFirstName() {
        System.out.println("Enter first name: ");
        firstName = scanner.nextLine().trim();
    }

    private static void getLastName() {
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine().trim();
    }

    private static void getMiddleName() {
        System.out.println("(Optional) Enter middle name: ");
        middleName = scanner.nextLine().trim();
    }

    private static void getSuffix() {
        System.out.println("(Optional) Enter suffix: ");
        suffix = scanner.nextLine().trim();
    }

    public static void getFullName() {
        getFirstName();
        getLastName();
        getMiddleName();
        getSuffix();
        if (middleName.isEmpty() && suffix.isEmpty()) {
            fullName = String.format("%s %s", firstName, lastName);
        } else if (suffix.isEmpty()) {
            fullName = String.format("%s %s %s", firstName, middleName, lastName);
        } else if (middleName.isEmpty()) {
            fullName = String.format("%s %s, %s", firstName, lastName, suffix);
        } else {
            fullName = String.format("%s %s %s, %s", firstName, middleName, lastName, suffix);
        }
    }

    public static void main(String[] args) {
        getFullName();
        System.out.println(fullName);
    }
}
