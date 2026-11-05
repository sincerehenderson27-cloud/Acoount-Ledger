package com.pluralsight;


import java.time.LocalDate;
import java.util.Scanner;

import static com.pluralsight.FinacialTracker.transactions;

public class Reports {
    public static void reportsScreen() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nREPORTS");

            System.out.println("1) Month To Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year To Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search By Vendor");
            System.out.println("0) Back");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    monthToDate();
                    break;

                case "2":
                    previousMonth();
                    break;

                case "3":
                    yearToDate();
                    break;

                case "4":
                    previousYear();
                    break;

                case "5":
                    searchByVendor();
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public static void searchByVendor() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Vendor: ");
        String vendor = scanner.nextLine();


        for (int i = transactions.size() - 1; i >= 0; i--) {

            Transaction transaction = transactions.get(i);

            if (transaction.getVendor()
                    .equalsIgnoreCase(vendor)) {

                System.out.println(transaction);
            }
        }
    }

    public static void yearToDate() {

        int currentYear =
                LocalDate.now().getYear();

        for (int i = transactions.size() - 1; i >= 0; i--) {

            Transaction transaction =
                    transactions.get(i);

            LocalDate transactionDate =
                    LocalDate.parse(
                            transaction.getDate());

            if (transactionDate.getYear()
                    == currentYear) {

                System.out.println(transaction);
            }
        }
    }

    public static void previousYear() {

        int previousYear =
                LocalDate.now().getYear() - 1;

        for (int i = transactions.size() - 1; i >= 0; i--) {

            Transaction transaction =
                    transactions.get(i);

            LocalDate transactionDate =
                    LocalDate.parse(
                            transaction.getDate());

            if (transactionDate.getYear()
                    == previousYear) {

                System.out.println(transaction);
            }
        }
    }

    public static void monthToDate() {

        LocalDate today =
                LocalDate.now();

        for (int i = transactions.size() - 1; i >= 0; i--) {

            Transaction transaction =
                    transactions.get(i);

            LocalDate transactionDate =
                    LocalDate.parse(
                            transaction.getDate());

            if (transactionDate.getYear()
                    == today.getYear()
                    &&
                    transactionDate.getMonth()
                            == today.getMonth()) {

                System.out.println(transaction);
            }
        }
    }

    public static void previousMonth() {

        LocalDate lastMonth =
                LocalDate.now().minusMonths(1);

        for (int i = transactions.size() - 1; i >= 0; i--) {

            Transaction transaction =
                    transactions.get(i);

            LocalDate transactionDate =
                    LocalDate.parse(
                            transaction.getDate());

            if (transactionDate.getYear()
                    == lastMonth.getYear()
                    &&
                    transactionDate.getMonth()
                            == lastMonth.getMonth()) {

                System.out.println(transaction);
            }
        }
    }
}


