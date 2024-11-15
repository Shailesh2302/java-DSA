import java.io.*;
import java.util.*;

public class Factorial {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int number = sc.nextInt();

    for (int i = 2; i < number; i++) {
      if (i % number == 0) {
        System.out.println("It is not a prime number");
        break;
      } else {
        System.out.println("it is a prime number");
      }
    }
  }
}
