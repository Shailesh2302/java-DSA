import java.io.*;
import java.util.*;

public class HollowRhombus {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number:");
    int number = sc.nextInt();

    int row = 1;
    int star = 5;
    int spaces = number - 1;
    int Inner_Spaces = number - 2;
    while (row <= number) {
      if (row == 1 || row == number) {
        for (int i = 1; i <= spaces; i++) {
          System.out.print("  ");
        }
        for (int i = 1; i <= star; i++) {
          System.out.print("* ");
        }
      } else {
        for (int i = 1; i <= spaces; i++) {
          System.out.print("  ");
        }
        System.out.print("* ");

        for (int i = 1; i <= Inner_Spaces; i++) {
          System.out.print("  ");
        }
        System.out.print("* ");
      }
      spaces--;
      row++;
      System.out.println();
    }
  }
}
