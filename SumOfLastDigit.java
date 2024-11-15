import java.io.*;
import java.util.*;

public class SumOfLastDigit {

  public static int Sum(int n) {
    int digit = 0;
    while (n > 0) {
      int Lastdigit = n % 10;

      digit = digit + Lastdigit;

      n = n / 10;
    }
    return digit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value:");
    int n = sc.nextInt();
    System.out.println("The sum is: " + Sum(n));
  }
  //   public static boolean PrintEvenFunction(int n){
  // int Digit = 0;
  //     while (n > 0) {

  //       int  Lastdigit= n % 10;

  //       Digit = Digit + Lastdigit;
  //     }
  // return true;
}
