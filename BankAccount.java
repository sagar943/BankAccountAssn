class BankAccount {
    private int acc_ID;
    protected double crnt_balance;

    public BankAccount(double initialAmount) {
        this.crnt_balance = initialAmount;
        System.out.println("Account is created with balance: " + crnt_balance);
    }

    public void deposit(double amount) {
    	crnt_balance += amount;
        System.out.println("Deposited successfully. Current balance: " + crnt_balance);
    }

    public void withdraw(double amount) {
        if (amount <= crnt_balance) {
        	crnt_balance -= amount;
            System.out.println("Withdrawal is successful. Current balance: " + crnt_balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + crnt_balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + crnt_balance);
    }

    public void transfer(double amount, BankAccount account) {
        if (amount <= crnt_balance) {
            withdraw(amount);
            account.deposit(amount);
        } else {
            System.out.println("Insufficient funds. Transfer not possible.");
        }
    }
}
