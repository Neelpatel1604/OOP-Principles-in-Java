package Encapsulation.BankAccountManager;

public class Start {
  
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Saad", 1000);
            account.deposit(500);
            account.withdraw(200);
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: $" + account.getBalance());
        }
   
    
}
