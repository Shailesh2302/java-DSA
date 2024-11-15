import java.util.*;

public class SwapAnotherExampleUsingArray {

  public static void reverse(int arr[]) {
    int first = 0, last = arr.length - 1;

    while (first < last) {
      int temp = arr[last];
      arr[last] = arr[first];
      arr[first] = temp;

      first++;
      last--;
    }
  }

  public static void main(String[] args) {
    int arr[] = {
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      12,
      13,
      14,
      15,
      30,
      45,
      59,
      67,
      76,
      82,
      85,
      89,
      91,
      93,
      95,
      99,
      100,
    };
    reverse(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
