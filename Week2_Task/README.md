# IMPLEMENT A SIMPLE BANKING SYSTEM
## Project Description

The Simple Banking System is a menu-driven Java console application that allows users to create bank accounts, deposit money, withdraw money, and check account balance.
The application uses MySQL database for persistent data storage and JDBC for database connectivity, following proper Object-Oriented Programming (OOP) principles.

## Objectives

1) Implement core OOP concepts (Encapsulation, Abstraction)
2) Perform basic banking operations
3) Store and retrieve data using MySQL database
4) Use JDBC for database connectivity
5) Handle real-world scenarios like insufficient balance and inactive accounts

## Features

1) Create a new bank account
2) Deposit amount
3) Withdraw amount
4) Check account balance
5) Menu-driven console interface
6) Persistent storage using MySQL
7) Input validation and balance checks

## Tech Stack:
1) Language: Java
2) Database: MySQL (Workbench)
3) Connectivity: JDBC

## Concepts Used:
1) OOP (Encapsulation)
2) DAO Pattern
3) PreparedStatement
4) Exception Handling

## Program Flow:
1) The program starts execution from the main() method in the BankingSystem class.
2) A menu is displayed to the user with the following options:
    a) Create Account
    b) Deposit Amount
    c) Withdraw Amount
    d) Check Balance
    e) Exit
3) The user enters a choice based on the required operation.
4) The system establishes a connection with the MySQL database using the DBConnection class and JDBC driver.
5) Based on the user’s choice:
   a. Create Account
      1) User enters account number, name, and account type.
      2) The details are stored in the database with an initial balance of 0 and status as Active.
   b. Deposit Amount
      1) User enters account number and deposit amount.
      2) The system fetches the account from the database.
      3) The balance is updated and stored back in the database.
   c. Withdraw Amount
      1) User enters account number and withdrawal amount.
      2) The system checks for sufficient balance.
      3) If sufficient, the balance is updated; otherwise, an error message is shown.
   d. Check Balance
      1) User enters account number.
      2) Account details including name, account type, balance, and status are displayed.
6) If the account is not found or is inactive, an appropriate message is shown.
7) After completing an operation, the menu is displayed again.
8) The program continues until the user selects the Exit option.
9) On exit, the program terminates gracefully and closes database connections.

## Sample Output 
### Create and Deposit Operations
![Create and Deposit Operations](output/Screenshot 2026-01-16 190641.png)

### Withdraw and Check Balance Operations
![Withdraw and Check Balance Operations](output/Screenshot 2026-01-16 190641.png)

