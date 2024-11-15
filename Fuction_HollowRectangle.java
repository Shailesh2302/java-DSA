import java.util.*;

public class Fuction_HollowRectangle {

  public static void HollowRect(int totalRow, int totalColumn) {
    for (int i = 1; i <= totalRow; i++) {
      for (int j = 1; j <= totalColumn; j++) {
        if (i == 1 || i == totalRow || j == 1 || j == totalColumn) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    HollowRect(4, 5);
  }
}
