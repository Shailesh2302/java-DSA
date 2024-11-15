import java.util.*;

public class BubbleSort {

  public static void bubblesort(int arr[]) {
    for (int tursize= 0; tursize< arr.length; turn++) {
      for (int i = 0; i < arr.length - 1 - turn; i++) {
        if (arr[i] > arr[i + 1]) {
          // swap
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 5, 3, 6, 2, 8, 7 };
    bubblesort(arr);
    printArray(arr);
  }
}
