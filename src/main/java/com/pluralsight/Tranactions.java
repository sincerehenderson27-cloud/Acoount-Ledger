package com.pluralsight;

public class Tranactions {
    private String date;
    private String time;
    private String description;
    private String vendor;
    private double amount;

    public void Transactions(String date, String time,
                             String description,
                             String vendor,
                             double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return date + "|" + time + "|" +
                description + "|" +
                vendor + "|" + amount;
    }
}
