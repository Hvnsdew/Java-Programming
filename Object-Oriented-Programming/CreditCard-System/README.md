# 💳 Credit Card Account Management System

A Java-based console application simulating core credit card financial transactions and account state management. This project demonstrates foundational **Object-Oriented Programming (OOP)** concepts, data encapsulation, and interactive CLI menu-driven design[cite: 8].

---

## 📌 Features & Supported Transactions

* **Account Initialization**: Prompts user to set up cardholder details including name, account number, due date, initial reward points, and balance[cite: 8].
* **Financial Operations**:
  * `Charge`: Purchases added directly to the outstanding balance[cite: 8].
  * `Cash Advance`: Direct cash withdrawals credited to the balance[cite: 8].
  * `Payment`: Deductions to settle the account balance[cite: 8].
  * `Interest Assessment`: Computes and applies percentage-based interest charges to the current balance[cite: 8].
* **Account Inquiry**: Displays comprehensive account summary and statistics (balance, due date, points)[cite: 8].

---

## 🏗 Architecture & OOP Principles

* **Encapsulation**: State fields (`AcBalence`, `RewardPoints`, `DueDate`, etc.) are declared `private` within `CreditCardInfo` to protect account data integrity[cite: 8].
* **Separation of Concerns**:
  * `CreditCard`: Handles CLI control flow, scanner input handling, and the interactive loop[cite: 8].
  * `CreditCardInfo`: Encapsulates transaction logic, balance arithmetic, and account state mutations[cite: 8].

---

## 🚀 How to Compile & Run

Open your terminal in the directory containing `CreditCard.java`[cite: 8]:

```bash
# 1. Compile the Java source file
javac CreditCard.java

# 2. Run the application
java CreditCard
