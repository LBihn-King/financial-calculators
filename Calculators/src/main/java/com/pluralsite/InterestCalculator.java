package com.pluralsite;
import java.util.Scanner;
public class InterestCalculator {
    public static Scanner scanner = new Scanner(System.in);


    private static double getInitAmount() {
        System.out.println("Enter principle amount: ");
        return scanner.nextDouble();
    }

    private static double getDailyRate() {
        System.out.println("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();
        return annualRate / 100;
    }

    private static int getTermLength() {
        System.out.println("Enter term length in years: ");
        return scanner.nextInt();
    }

    public static void calculateFinalValue() {
        double P = getInitAmount();
        double r = getDailyRate();
        int n = 365;
        int t = getTermLength();

        double finalVal = P * Math.pow(1 + r / n, n * t);

        System.out.printf("Your final value is $%.02f\n", finalVal);
        double interestEarned = finalVal - P;
        System.out.printf("Total interest of $%.02f", interestEarned);
    }
    public static void main(String[] args) {
        calculateFinalValue();
    }
}