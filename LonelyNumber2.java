import java.util.*;

public class LonelyNumber2 {

  public static void LonelyNumber(int arr[]) {
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      if (i == 0) {
        if (arr[i + 1] - arr[i] > 1) {
          System.out.println(arr[i]);
        }
      } else if (i == arr.length - 1) {
        if (arr[i] - arr[i - 1] > 1) {
          System.out.println(arr[i]);
        }
      } else {
        if (arr[i + 1] - arr[i] > 1 && arr[i] - arr[i - 1] > 1) {
          System.out.println(arr[i]);
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 6, 2, 9, 7, 6, 8, 4, 5 };
    LonelyNumber(arr);
  }
}
