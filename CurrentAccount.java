class CurrentAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 200.0;

    public CurrentAccount(double initialAmount) {
        super(initialAmount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        crnt_balance -= WITHDRAWAL_FEE;
        System.out.println("Withdrawal fee is charged: " + WITHDRAWAL_FEE);
        System.out.println("balance after withdrawal fee: " + crnt_balance);
    }
}