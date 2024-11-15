import java.io.*;
import java.util.*;

public class Palindrome {

  public static boolean Palindrome(int n) {
    int myNum = n;
    int pow = 2;

    int Palindrome = 0;
    while (n > 0) {
      int LastDigit = n % 10;
      Palindrome = Palindrome + (LastDigit * (int) Math.pow(10, pow));
      pow--;
      n = n / 10;

      if (myNum == Palindrome) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    System.out.println(Palindrome(221));
  }
}
