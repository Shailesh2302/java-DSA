import java.lang.reflect.Array;
import java.util.Arrays;

public class LonelyNumber {

  public static void lonelyNumber(int arr[]) {
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
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

  public static void main(String args[]) {
    int arr[] = { 4, 11, 2, 6, 3, 8 };
    lonelyNumber(arr);
  }
}
