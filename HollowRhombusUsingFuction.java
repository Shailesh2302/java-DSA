import java.util.*;

public class HollowRhombusUsingFuction {

  public static void HollowRhombus(int n, int m) {
    // Using method 1
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= n - i; j++) {
    //     System.out.print(" ");
    //   }
    //   if (i == 1 || i == n) {
    //     for (int j = 1; j <= n; j++) {
    //       System.out.print("*");
    //     }
    //   } else {
    //     System.out.print("*");

    //     for (int j2 = 1; j2 <= n - 2; j2++) {
    //       System.out.print(" ");
    //     }
    //     System.out.print("*");
    //   }
    //   System.out.println();
    //}

    // Using method 2
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= m; j++) {
        if (i == 1 || i == n || j == 1 || j == m) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    HollowRhombus(4, 5);
  }
}
