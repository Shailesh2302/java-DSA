import java.io.*;
import java.util.*;

public class FLOYDS_TringlePatter {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int size= sc.nextInt();

    int number = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    }
  }
}
