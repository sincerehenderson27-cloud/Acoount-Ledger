# 💰 Financial Ledger Application

A Java-based financial ledger application that allows users to track deposits, payments, and account activity through an easy-to-use command-line interface. This project was built to strengthen my understanding of object-oriented programming, file handling, collections, and date/time operations in Java.

---

## 📖 Overview

The Financial Ledger Application provides a simple way to manage financial transactions by storing data in a CSV file. Users can record deposits and payments, view transaction history, and generate reports based on dates and vendors.

---

## ✨ Features

### 🏠 Home Screen

- Add Deposit
- Make Payment
- View Ledger
- Exit Application

### 📒 Ledger Screen

- Display All Transactions
- Display Deposits Only
- Display Payments Only
- Access Reports
- Return to Home Screen

### 📊 Reports

- Month-to-Date
- Previous Month
- Year-to-Date
- Previous Year
- Search by Vendor


---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList Collections
- File I/O
- CSV Data Storage
- LocalDate
- LocalTime

---

## 📂 Project Structure

```text
FinancialLedger/
│
├── Main.java
├── Transaction.java
├── TransactionFileManager.java
├── transactions.csv
└── README.md
```

---

## 📝 Transaction Format

Transactions are stored in a CSV file using the following format:

```text
date|time|description|vendor|amount
```

### Example

```text
2025-08-15|10:18:27|Consulting Services Payment|Emily Rodriguez|2200.00
2025-09-20|13:44:55|Dinner with Clients|Olive Garden|-124.78
```

Positive values represent deposits:

```text
2025-10-08|09:12:34|Freelance Website Payment|Sarah Johnson|950.00
```

Negative values represent payments:

```text
2025-09-20|13:44:55|Dinner with Clients|Olive Garden|-124.78
```

---

## 🏗️ Class Design

### Transaction Class

The `Transaction` class stores:

- Date
- Time
- Description
- Vendor
- Amount

Responsibilities:

- Store transaction information
- Provide getter methods
- Format transaction output using `toString()`

### TransactionFileManager Class

Responsibilities:

- Load transactions from the CSV file
- Save transactions to the CSV file
- Handle all file-related operations

---

## 🎯 Concepts Practiced

This project helped me gain hands-on experience with:

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- ArrayLists
- HashMaps
- Loops
- Conditional Logic
- Methods
- File Reading
- File Writing
- Exception Handling
- Date and Time APIs
- Data Filtering
- Report Generation

---

## 🚀 Future Enhancements

Some features I would like to add in future versions:

- Budget Tracking
- Expense Categories
- Monthly Spending Summaries
- Data Visualization
- Database Integration (MySQL)
- User Authentication
- JavaFX GUI Interface
- PDF Report Exporting

---

## 💡 What I Learned

Building this project strengthened my understanding of Java fundamentals while giving me experience developing a real-world application. Through this project, I improved my skills in object-oriented programming, file management, debugging, collections, and working with date and time data.

---

## 👨‍💻 Author

### Sincere Henderson

Aspiring Software Developer • Java Student • Lifelong Learner

I am a detail-oriented and highly motivated developer who enjoys building practical software solutions while continuously expanding my technical skills. This project represents my growth as a Java programmer and my commitment to learning through hands-on development.

---

## 📸 Sample Application Flow

```text
HOME SCREEN

[D] Add Deposit
[P] Make Payment
[L] Ledger
[X] Exit

Select an option:
```

```text
LEDGER SCREEN

[A] All Transactions
[D] Deposits
[P] Payments
[R] Reports
[H] Home
```

---

⭐ If you found this project interesting, feel free to fork it, explore the code, and share feedback!
