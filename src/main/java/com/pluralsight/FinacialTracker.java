package com.pluralsight;

import com.pluralsight.Transaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

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
}

