import java.io.*;
import java.util.*;

public class DisplayAllNumbersEnteredByUserExceptMultipleOf10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your number:");
            int i = sc.nextInt();

            if (i % 10 == 0) {
                continue;
            }
            System.out.println("Number was:" + i);

        } while (true);

    }
}