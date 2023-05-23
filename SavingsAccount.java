class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(double initialAmount) {
        super(initialAmount);
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * INTEREST_RATE;
        super.deposit(amount + interest);
        System.out.println("Interest is added: " + interest);
    }
}