import java.io.*;
import java.util.*;

public class PalindromeUsingNew {

  // public static void main(String args[]) {
  //   System.out.println("Please Enter a number :");
  //   Scanner sc = new Scanner(System.in);
  //   int palindrome = sc.nextInt();
  //   if (isPalindrome(palindrome)) {
  //     System.out.println("Number : " + palindrome + " is a palindrome");
  //   } else {
  //     System.out.println("Number : " + palindrome + " is not a palindrome");
  //   }
  // }

  // public static boolean isPalindrome(int number) {
  //   int palindrome = number; // copied number into variable
  //   int reverse = 0;
  //   while (palindrome > 0) {
  //     int remainder = palindrome % 10;
  //     reverse = reverse * 10 + remainder;
  //     palindrome = palindrome / 10;
  //   }

  //   // if original and the reverse of number is equal means// number is palindrome in Java
  //   if (number == reverse) {
  //     return true;
  //   }
  //   return false;

  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    if (isPalindrome(n)) {
      System.out.println("it is a polindrome: " + n);
    } else {
      System.out.println("it is not a polindrome: " + n);
    }
  }

  public static boolean isPalindrome(int n) {
    int palindrome = n;
    int reverse = 0;
    while (n > 0) {
      int LastDigit = n % 10;

      reverse = reverse * 10 + LastDigit;

      n /= 10;
    }
    if (reverse == palindrome) {
      return true;
    }
    return false;
  }
}
