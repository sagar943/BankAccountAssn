public class Main {
    public static void main(String[] args) {
       
        BankAccount B1 = new BankAccount(500);
        BankAccount B2 = new BankAccount(200);
        B1.withdraw(200);
        B2.deposit(1000);
        B2.transfer(500, B1);
        B1.checkBalance();
        B2.checkBalance();

      
        SavingsAccount savingsAccount = new SavingsAccount(2000);
        savingsAccount.deposit(500);
        savingsAccount.checkBalance();

       
        CurrentAccount currentAccount = new CurrentAccount(2000);
        currentAccount.deposit(500);
        currentAccount.withdraw(100);
        currentAccount.transfer(500, savingsAccount);
        currentAccount.checkBalance();
        savingsAccount.checkBalance();

        
        currentAccount.transfer(1000, savingsAccount);
        currentAccount.checkBalance();
        savingsAccount.checkBalance();
    }
}

