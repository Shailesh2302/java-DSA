import java.io.*;
import java.util.*;

public class InvertNumber {

  public static void main(String args[]) {
    //1       Using for loop
    // int size= 5;
    // int a = 1;
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= size- i + 1; j++) {
    //     System.out.print(j);
    //   }

    //   System.out.println();
    // }
    //2    Using while loop
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc.nextInt();
    // int total_rows = number;

    // int rows = 1;

    // while (rows <= total_rows) {
    //   for (int i = 1; i <= number; i++) {
    //     System.out.print(i);
    //   }

    //   number--;
    //   rows++;
    //   System.out.println();
    // }
    // 3     Using another techniques

    // while (rows <= number) {
    //   for (int i = 1; i <= number; i++) {
    //     System.out.print(i);
    //   }

    //   number--;

    //   System.out.println();
    // }

    //4     Using Another technique

    int total_rows = number;
    int numbers = number;
    int spaces = 0;
    int row = 1;

    while (row <= total_rows) {
      //print star
      int num = 1;
      for (int i = 1; i <= numbers; i++) {
        System.out.print(num);
        num++;
      }
      //   for (int i = 1; i <= spaces; i++) {
      //     System.out.print(" ");
      //   }
      row++;
      numbers--;

      // spaces++;
      System.out.println();
    }
    //5    Using another technique
    // int total_rows = number;
    // int numbers = number;
    // int spaces = 0;
    // int row = 1;
    // while (row <= total_rows) {
    //   //print star

    //   for (int i = 1; i <= numbers; i++) {
    //     System.out.print(i);
    //   }

    //   row++;
    //   numbers--;

    //   // spaces++;
    //   System.out.println();
    // }
  }
}
