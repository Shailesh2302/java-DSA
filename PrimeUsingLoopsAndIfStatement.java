import java.io.*;
import java.util.*;

public class PrimeUsingLoopsAndIfStatement {

    /**
     * @param args
     */
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int Flag = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                Flag = 0;

                break;
            }
        }
        if (Flag == 1) {
            System.out.println("It is a prime number");

        } else {
            System.out.println("It is not a prime number");
        }
    }

}
