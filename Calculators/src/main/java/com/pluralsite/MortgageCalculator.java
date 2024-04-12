package com.pluralsite;
import java.util.Scanner;

public class MortgageCalculator {
    public static Scanner scanner = new Scanner(System.in);


    private static double getLoanAmount(){
        System.out.println("Enter principle amount: ");
        return scanner.nextDouble();
    }

    private static double getMonthlyRate() {
        System.out.println("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();
        return (annualRate/12) / 100;
    }

    private static int getNumberOfPayments() {
        System.out.println("Enter term length in months: ");
        return scanner.nextInt();
    }

    public static void calculateMonthlyPayment() {
        double P = getLoanAmount();
        double r = getMonthlyRate();
        int n = getNumberOfPayments();

        double monthlyPayment = (P * r) / (1 - Math.pow(1 + r, -n));

        System.out.printf("Your monthly payment is $%.02f\n", monthlyPayment);
        double totalPaid = monthlyPayment * n;
        double interestPaid = totalPaid - P;
        System.out.printf("Total interest of $%.02f", interestPaid);
    }
    public static void main(String[] args) {
        calculateMonthlyPayment();
    }
}

