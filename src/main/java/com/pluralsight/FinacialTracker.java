package com.pluralsight;

import javax.management.AttributeList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;




public class FinacialTracker {
    static ArrayList<Transaction> transactions =
            new ArrayList<>();

    public static void main(String[] args) {
        transactions = TransactionFileManager.loadTransactions();
        homeScreen();


    }


    public static void addDeposit() {

        Scanner scanner =
                new Scanner(System.in);

        System.out.print("Description: ");
        String description =
                scanner.nextLine();

        System.out.print("Vendor: ");
        String vendor =
                scanner.nextLine();

        System.out.print("Amount: ");
        double amount =
                Double.parseDouble(
                        scanner.nextLine());

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        String date = today.toString();

        String time =
                now.withNano(0).toString();

        Transaction transaction =
                new Transaction(
                        date,
                        time,
                        description,
                        vendor,
                        amount);


        transactions.add(transaction);
        TransactionFileManager.saveTransaction(transaction);
    }


    public static void displayTransactions() {

        for (Transaction transaction : transactions) {

            System.out.println(transaction);

        }
    }

    public static void addPayment() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        // Make sure the amount is negative
        amount = -Math.abs(amount);

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        String date = today.toString();
        String time = now.toString();

        Transaction transaction = new Transaction(
                date,
                time,
                description,
                vendor,
                amount);

        transactions.add(transaction);

        TransactionFileManager.saveTransaction(transaction);

        System.out.println("Payment saved!");
    }


    public static void homeScreen() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nHOME");

            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment");
            System.out.println("L) Ledger");
            System.out.println("X) Exit");

            String choice =
                    scanner.nextLine().toUpperCase();

            switch (choice) {

                case "D":
                    addDeposit();
                    break;

                case "P":
                    addPayment();
                    break;

                case "L":
                    Ledger.ledgerScreen();
                    break;

                case "X":
                    return;


            }
        }
    }
}



