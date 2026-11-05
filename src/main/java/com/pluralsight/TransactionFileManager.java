package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

    public class TransactionFileManager {

        private static final String FILE_NAME = "transactions.csv";

        // Read all transactions from the file
        public static ArrayList<Transaction> loadTransactions() {
            ArrayList<Transaction> transactions = new ArrayList<>();


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
            return transactions;
        }
        public static void saveTransaction(Transaction transaction)
        {
            try
            {
                FileWriter fw = new FileWriter(FILE_NAME, true);
                PrintWriter writer = new PrintWriter(fw);

                writer.println(transaction);

                writer.close();
            }
            catch (IOException e)
            {
                System.out.println("Error saving transaction.");
            }
        }
    }










