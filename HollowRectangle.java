import java.util.*;

public class HollowRectangle {

  public static void HollowRectangle(int n, int m) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (i == 1 || i == size|| j == 1 || j == m) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    HollowRectangle(5, 6);
  }
}
