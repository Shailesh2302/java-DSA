import java.util.*;

public class StringIsPalindrome {

  public static boolean Palindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String name = "shailesh";
    String name2 = "racecar";
    System.out.println(Palindrome(name));
    System.out.println(Palindrome(name2));
  }
}
