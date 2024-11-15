import java.io.*;
import java.util.*;

public class NumberIsPrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("It is a prime number");

        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("It is a prime number");

            } else {
                System.out.println("It is not a prime number");
            }
        }

    }
}
