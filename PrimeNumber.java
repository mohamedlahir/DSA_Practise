import javax.crypto.spec.PSource;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToCheck = input.nextInt();
        int count = 0;
        if (numberToCheck > 1) {
            for (int i = 1; i <= numberToCheck; i++) {
                if (numberToCheck % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("The given number is an prime number");
            } else {
                System.out.println("The given number is not a prime number");
            }


        }
    }

}
