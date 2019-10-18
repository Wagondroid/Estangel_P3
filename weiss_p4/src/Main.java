import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static int a;
    private static int b;

    private static int count = 0;
    private static int correct = 0;

    private static int difficultLevel = 1;

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {

        newQuestion();


        while (true) {
            System.out.println("\nHow much is " + a + " times " + b);

            Scanner scanner = new Scanner(System.in);
            int result = scanner.nextInt();
            count++;
            int randomNumber = (int) (Math.random() * 4 + 1);

            if (result == a * b) {
                System.out.println(getCorrectComment(randomNumber));
                correct++;
                isLevelEnd();
                newQuestion();
            } else {
                System.out.println(getWrongComment(randomNumber));
                isLevelEnd();
            }
        }
    }

    private static void isLevelEnd(){
        if (count == 10) {
            if (printReport() && difficultLevel < 4) {
                difficultLevel++;
            }
            count = 0;
            correct = 0;
        }
    }


    private static boolean printReport() {
        if ((correct / 10f) * 100f >= 75f) {
            System.out.println("Congratulations, you are ready to go to the next level!");
            return true;
        } else {
            System.out.println("Please ask your teacher for extra help.");
            return false;
        }
    }

    private static String getCorrectComment(int randomNumber) {
        switch (randomNumber) {
            case 1:
                return "Very good!";
            case 2:
                return "Excellent!";
            case 3:
                return "Nice work!";
            case 4:
                return "Keep up the good work!";
        }
        return "Very goo";
    }

    private static String getWrongComment(int randomNumber) {
        switch (randomNumber) {
            case 1:
                return "No. Please try again.";
            case 2:
                return "Wrong. Try once more.";
            case 3:
                return "Don't give up!";
            case 4:
                return "No. Keep trying";
        }
        return "";
    }


    private static void newQuestion() throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        switch (difficultLevel) {
            case 1:
                a = sr.nextInt(10);
                b = sr.nextInt(10);
                break;
            case 2:
                a = sr.nextInt(100);
                b = sr.nextInt(100);
                break;
            case 3:
                a = sr.nextInt(1000);
                b = sr.nextInt(1000);
                break;
            case 4:
                a = sr.nextInt(10000);
                b = sr.nextInt(10000);
                break;
        }

    }

}