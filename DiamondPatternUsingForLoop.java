import java.io.*;
import java.util.*;

public class DiamondPatternUsingForLoop {

  public static void main(String args[]) {
    int size= 8;
    int spaces = size- 1;
    int stars = 1;

    {
      for (int i = 1; i <= size+ 1; i++) {
        for (int j = 1; j <= spaces; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j <= stars; j++) {
          System.out.print("*");
        }

        if (i < size/ 2) {
          spaces--;
          stars += 2;
        } else if (i == size/ 2) {
          i++;
        } else {
          spaces++;
          stars -= 2;
        }
        System.out.println();
      }
    }
  }
}
