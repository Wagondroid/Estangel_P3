public class SavingsAccount {

    private static float annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double deposit){
        savingsBalance = deposit;
    }


    void calculateMonthlyInterest() {
        savingsBalance += ((savingsBalance * annualInterestRate) / 12);
    }

    static void modifyInterestRate(float interestRate){
        annualInterestRate = interestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
