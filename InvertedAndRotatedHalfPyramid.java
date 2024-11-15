import java.io.*;
import java.util.*;

public class InvertedAndRotatedHalfPyramid {

  public static void main(String args[]) {
    int n = 5;
    //Using for loop

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //Using while loop
    int star = 1;
    int spaces = n - 1;
    int row = 1;
    while (row <= n) {
      for (int i = 0; i < spaces; i++) {
        System.out.print(" ");
      }
      for (int j = 0; j < star; j++) {
        System.out.print("*");
      }
      star++;
      spaces--;
      row++;
      System.out.println();
    }
  }
}
