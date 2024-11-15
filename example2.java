import java.util.*;

public class example2 {

  public static void subArraays(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    subArraays(arr);
  }
}
