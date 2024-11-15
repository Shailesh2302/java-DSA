import java.io.*;
import java.util.*;

public class ZeroOnePattern {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc.nextInt();
    // int row = 1;
    // int n = 1;
    // int Total_rows = number;

    // while (row <= Total_rows) {
    //   for (int i = 1; i <= row; i++) {
    //     if (n % 2 == 0) {
    //       System.out.print("0");
    //     } else {
    //       System.out.print("1");
    //     }
    //     n++;
    //   }
    //   row++;

    //   System.out.println();
    // }

    // Using technique 2
    // while (row <= Total_rows) {
    //   if (row % 2 == 1) {
    //     for (int i = 1; i <= row; i++) {
    //       if (i % 2 == 1) {
    //         System.out.print("1");
    //       } else {
    //         System.out.print("0");
    //       }
    //       i++;
    //     }
    //   } else {
    //     for (int i = 1; i <= row; i++) {
    //       if (i % 2 == 0) {
    //         System.out.print("0");
    //       } else {
    //         System.out.print("1");
    //       }
    //       i++;
    //     }
    //   }
    //   row++;
    //   System.out.println();
    // }

    /// Another technique

    for (int i = 1; i <= number; i++) {
      if (i % 2 == 1) {
        for (int j = 1; j <= i; j++) {
          if (j % 2 == 1) {
            System.out.print("1");
          } else {
            System.out.print("0");
          }
          j++;
        }
      } else {
        for (int j = 1; j <= i; j++) {
          if (j % 2 == 0) {
            System.out.print("0");
          } else {
            System.out.print("1");
          }
          j++;
        }
      }
      System.out.println();
    }
  }
}
