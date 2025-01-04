# Bank Account Manager

## Project Overview
This project includes a Bank Account Management system that demonstrates the encapsulation principle of Object-Oriented Programming (OOP). It allows for the management of bank accounts, enabling operations such as deposits and withdrawals while ensuring data integrity.

### Class Descriptions

1. **BankAccount.java**
   - This class represents a bank account, encapsulating the account holder's information and balance.
   - **Constructor**:
     - `BankAccount(String accountHolder, double initialBalance)`: Initializes the account with the holder's name and an initial balance.
   - **Methods**:
     - `getAccountHolder()`: Returns the name of the account holder.
     - `getBalance()`: Returns the current balance of the account.
     - `deposit(double amount)`: Adds the specified amount to the account balance if valid.
     - `withdraw(double amount)`: Deducts the specified amount from the account balance if sufficient funds are available.

2. **Start.java**
   - This is the main class that runs the application. It creates an instance of `BankAccount`, performs transactions, and displays account details.
   - **Functionality**:
     - Instantiate a `BankAccount` object.
     - Perform deposit and withdrawal operations.
     - Print the account holder’s name and current balance.

### How to Run
1. Compile all Java files in the `Encapsulation/BankAccountManager` directory.
2. Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display the account holder's name and the current balance after performing the transactions.
``` 
Account Holder: Saad
Balance: $1300.0
```
