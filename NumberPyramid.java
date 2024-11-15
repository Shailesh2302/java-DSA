import java.io.*;
import java.util.*;

public class NumberPyramid {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc.nextInt();

    int row = 1;
    int n = 1;
    int spaces = number - 1;

    while (row <= number) {
      for (int i = 1; i <= spaces; i++) {
        System.out.print("  ");
      }
      for (int i = 1; i <= n; i++) {
        System.out.print(n + "   ");
      }
      //   for (int i = 1; i <= spaces; i++) {
      //     System.out.print("");
      //   }
      row++;
      n++;
      spaces--;
      System.out.println();
    }
  }
}
