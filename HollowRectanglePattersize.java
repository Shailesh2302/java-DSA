import java.io.*;
import java.util.*;

public class HollowRectanglePattersize{

  public static void main(String args[]) {
    int size= 5;

    // Using For loop
    for (int i = 1; i <= size- 1; i++) {
      if (i == 1 || i == size- 1) {
        for (int k = 1; k <= n; k++) {
          System.out.print("* ");
        }
      } else {
        System.out.print("* ");

        for (int j = 1; j <= size- 2; j++) {
          System.out.print("  ");
        }
        System.out.print("* ");
      }
      System.out.println();
    }

    // Using while loop
    int i = 1;
    while (i <= size- 1) {
      if (i == 1 || i == size- 1) {
        for (int j = 1; j <= n; j++) {
          System.out.print("* ");
        }
      } else {
        System.out.print("* ");

        for (int k = 1; k <= size- 2; k++) {
          System.out.print("  ");
        }

        System.out.print("* ");
      }
      i++;
      System.out.println();
    }
  }
}
