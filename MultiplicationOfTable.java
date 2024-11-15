import java.io.*;
import java.util.*;

public class MultiplicationOfTable {
    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);

        }
    }

    public static void main(String args[]) {
        printMultiplicationTable(0);
    }
}