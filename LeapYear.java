import java.io.*;
import java.util.*;

public class LeapYear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the next year:");
        int year = sc.nextInt();

        // Approach 1
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("it is a leap year");

                } else {
                    System.out.println("it is not a leap year");
                }
            } else {
                System.out.println("it is a leap year");
            }

        } else {
            System.out.println("it is not a leap year");
        }

        // using Approach 2
        boolean IsLeapYear = (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0)
                ? true
                : false : true : false;
        if (IsLeapYear) {
            System.out.println("it is a leap year");

        } else {
            System.out.println("it is not a leap year");
        }

        // using Approach 3
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = (year % 400) == 0;

        if (a && (b || c)) {
            System.out.println("It is a leap year");

        } else {
            System.out.println("It is not a leap year");
        }

    }

}