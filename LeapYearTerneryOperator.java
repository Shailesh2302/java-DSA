import java.io.*;
import java.util.*;

public class LeapYearTerneryOperator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the leap year :");
        int year = sc.nextInt();

        boolean IsLeapYear = (year % 4 == 0) ? (year % 100 == 0) ? (year % 400 == 0) ? true : false : true : false;
        System.out.println(IsLeapYear);
    }
}
