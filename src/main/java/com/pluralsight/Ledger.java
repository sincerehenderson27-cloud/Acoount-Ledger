package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.FinacialTracker.transactions;

public class Ledger {

    public static void ledgerScreen() {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nLEDGER");

            System.out.println("A) All");
            System.out.println("D) Deposits");
            System.out.println("P) Payments");
            System.out.println("R) Reports");
            System.out.println("H) Home");

            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {

                case "A":
                    displayAll();
                    break;

                case "D":
                    displayDeposits();
                    break;

                case "P":
                    displayPayments();
                    break;

                case "R":
                    Reports.reportsScreen();
                    break;

                case "H":
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }



        public static void displayAll () {

            for (int i = transactions.size() - 1; i >= 0; i--) {

                System.out.println(transactions.get(i));
            }
        }


        public static void displayDeposits () {

            for (int i = transactions.size() - 1; i >= 0; i--) {

                Transaction transaction = transactions.get(i);

                if (transaction.getAmount() > 0) {

                    System.out.println(transaction);
                }
            }
        }

        public static void displayPayments () {

            for (int i = transactions.size() - 1; i >= 0; i--) {

                Transaction transaction = transactions.get(i);

                if (transaction.getAmount() < 0) {

                    System.out.println(transaction);
                }
            }
        }
    }











