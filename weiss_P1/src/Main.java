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

            if (result == a * b) {
                System.out.println("Very good!");
                newQuestion();
            } else {
                System.out.println("No. Please try again.");
            }
        }

    }


    static void newQuestion() throws NoSuchAlgorithmException, NoSuchProviderException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        a = sr.nextInt(10);
        b = sr.nextInt(10);
    }

}
