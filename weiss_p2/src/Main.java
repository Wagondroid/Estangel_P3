import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    static int a;
    static int b;

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {

        newQuestion();

        while (true) {
            System.out.println("How much is " + a + " times " + b);

            Scanner scanner = new Scanner(System.in);
            int result = scanner.nextInt();

            int randomNumber = (int )(Math.random() * 4 + 1);

            if (result == a * b) {

                System.out.println(getCorrectComment(randomNumber));
                newQuestion();
            } else {
                System.out.println(getWrongComment(randomNumber));
            }
        }

    }

    private static String getCorrectComment(int randomNumber) {
        switch (randomNumber){
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
        switch (randomNumber){
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


    static void newQuestion() throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        a = sr.nextInt(10);
        b = sr.nextInt(10);
    }

}
