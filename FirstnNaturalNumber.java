import java.io.*;
import java.util.*;

public class FirstnNaturalNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= number) {
            sum = sum + counter;
            counter++;

        }
        System.out.println(sum);
    }

}
