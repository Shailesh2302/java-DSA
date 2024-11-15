import java.io.*;
import java.util.*;

public class ButterflyPattersize{

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number:");
    int number = sc.nextInt();

    int row = 1;
    int Total_rows = number;
    int star = 1;
    int spaces = number - 2;

    while (row <= Total_rows) {
      for (int i = 1; i <= star; i++) {
        System.out.print("* ");
      }
      for (int i = 1; i <= spaces; i++) {
        System.out.print("  ");
      }
      for (int i = 1; i <= star; i++) {
        System.out.print("* ");
      }

      if (row < (number / 2)) {
        star++;
        row++;
        spaces = spaces - 2;
      } else if (row == (number / 2)) {
        row++;
      } else {
        star--;
        row++;
        spaces = spaces + 2;
      }

      System.out.println();
    }
  }
}
