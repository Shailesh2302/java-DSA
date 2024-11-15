import java.io.*;
import java.util.*;

public class SolidRhombus {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc.nextInt();

    int Total_rows = number;
    int star = 5;
    int spaces = number - 1;
    int row = 1;
    while (row <= Total_rows) {
      for (int i = 1; i <= spaces; i++) {
        System.out.print("  ");
      }
      for (int i = 1; i <= star; i++) {
        System.out.print("* ");
      }
      row++;
      spaces--;
      System.out.println();
    }
  }
}
