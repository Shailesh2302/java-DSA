import java.io.*;
import java.util.*;

public class DiamondPattersize{

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int size= sc.nextInt();

    int row = 1;
    int star = 1;
    int spaces = size- star;

    while (row <= size+ 1) {
      for (int i = 0; i < (spaces / 2); i++) {
        System.out.print("  ");
      }
      for (int i = 0; i < star; i++) {
        System.out.print("* ");
      }
      for (int i = 0; i < (spaces / 2); i++) {
        System.out.print("  ");
      }
      if (row <= (size/ 2)) {
        star = star + 2;
        spaces = spaces - 2;
        row++;
      } else if (row == (size/ 2) + 1) {
        row++;
      } else {
        row++;
        spaces = spaces + 2;
        star = star - 2;
      }

      System.out.println();
    }
  }
}
