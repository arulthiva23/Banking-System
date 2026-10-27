# Banking System - Java OOP Learning Project

A modular, console-based Java application built from scratch to master core **Object-Oriented Programming (OOP)** principles, package-based architecture, and clean separation of concerns. 

This project was developed as a hands-on portfolio piece to transition from basic syntax to structured, scalable Java application development.

---

##  Key Features

* **Multi-Tier Account Management:** Create and manage **Savings Accounts** (with interest calculation and minimum balance rules) and **Current/Checking Accounts** (with overdraft limits).
* **Core Banking Operations:** Perform secure deposits and withdrawals with real-time balance validation.
* **Modular Package Architecture:** Organized into clean, logical layers separating data models, business logic, and user interaction.
* **Console-Based Interactive Menu:** Seamless navigation loop for users to interact with accounts dynamically.

---

## 📂 Project Structure

The project follows a standard package-based directory hierarchy inside the `src` folder:

```text
src/
└── com/
    └── bank/
        ├── Main.java                  # User Interface & Console Menu
        ├── model/
        │   ├── BankAccount.java       # Abstract Base Entity
        │   ├── SavingsAccount.java    # Inherited Savings Model
        │   └── CurrentAccount.java    # Inherited Current/Checking Model
        └── service/
            └── Bank.java              # Business Logic & Account Manager