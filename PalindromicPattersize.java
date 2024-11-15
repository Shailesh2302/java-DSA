import java.io.*;
import java.util.*;

public class PalindromicPattersize{

  public static void PalindromePattern(int number) {
    int row = 1;

    int spaces = number - 1;
    while (row <= number) {
      int r = 1;
      for (int i = 1; i <= spaces; i++) {
        System.out.print("  ");
      }
      for (int i = 1; i <= row - 1; i++) {
        System.out.print(row - i + 1 + " ");
      }

      for (int i = 1; i <= row; i++) {
        System.out.print(r + " ");
        r++;
      }
      row++;

      spaces--;
      System.out.println();
    }
  }

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number:");
    // int number = sc.nextInt();

    PalindromePattern(6);
  }
}
