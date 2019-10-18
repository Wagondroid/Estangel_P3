public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);

        int i = 1;
        for(;i<=12;i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("Saver1 Balance after month "+i +" is "+saver1.getSavingsBalance());
            System.out.println("Saver2 Balance after month "+i +" is "+saver2.getSavingsBalance());
            System.out.println("\n\n");
        }

        SavingsAccount.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Saver1 Balance after month "+i +" is "+saver1.getSavingsBalance());
        System.out.println("Saver2 Balance after month "+i +" is "+saver2.getSavingsBalance());


    }
}
