import java.util.*;

public class FactorialOfNumber {

  public static int Factorial(int n) {
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.print("The factorial is:" + fact);
    retursizefact;
  }

  public static void main(String args[]) {
    Factorial(5);
  }
}
