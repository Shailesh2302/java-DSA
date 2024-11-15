import java.util.*;

public class ReverseArray {

  public static int reverseArray(int arr[]) {
    int[] temp = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[arr.length - i - 1];
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }
    return;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    System.out.println(reverseArray(arr[i]));
  }
}
