package com.pluralsight;

import com.pluralsight.Transaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class FinacialTracker {
    static ArrayList<Transaction> transactions =
            new ArrayList<>();

    public static void main(String[] args) {
        loadTransactions();
        displayTransactions();


    }

    public static void loadTransactions() {
        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("transactions.csv"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                String date = parts[0];
                String time = parts[1];
                String description = parts[2];
                String vendor = parts[3];
                double amount =
                        Double.parseDouble(parts[4].trim());

                Transaction transaction =
                        new Transaction(
                                date,
                                time,
                                description,
                                vendor,
                                amount);

                transactions.add(transaction);
            }


            reader.close();

        } catch (Exception e) {

            System.out.println("Error reading file.");

        }
    }

    public static void displayTransactions() {

        for (Transaction transaction : transactions) {

            System.out.println(transaction);

        }
    }
        public static void addDeposit () {

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
                    ledgerScreen();
                    break;

                case "X":
                    return;


                    scanner.nextLine();
                }
            }
        }


