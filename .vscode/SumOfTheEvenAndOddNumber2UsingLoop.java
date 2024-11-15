import java.io.*;
import java.util.*;

public class SumOfTheEvenAndOddNumber2UsingLoop {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number:");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;

            } else {
                oddSum += number;
            }
            System.out.println("for continue Press 1 and to Stop Press any Number:");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of evesizenumber:" + evenSum);
        System.out.println("Sum of odd number:" + oddSum);
    }
}
