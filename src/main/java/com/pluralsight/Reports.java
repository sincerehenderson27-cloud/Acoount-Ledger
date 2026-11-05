package com.pluralsight;

import java.util.Scanner;

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
}
