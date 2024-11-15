import java.io.*;
import java.util.*;

public class FactorialOfAnyNumber {

  public static void main(String args[]) {
    long fact = 1;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Number:");
    long num = sc.nextInt();
    for (long i = 1; i <= num; i++) {
      fact *= i;
      System.out.println(fact);
    }
    System.out.println("The factorial is :" + fact);
  }
}
