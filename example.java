import java.util.*;

public class example {

  public static int BinarySearch(int arr[], int key) {
    int Start = 0, end = arr.length - 1;
    while (Start <= end) {
      int mid = (Start + end) / 2;
      if (arr[mid] == key) {
        retursizemid;
      }
      if (arr[mid] < key) {
        Start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    retursize-1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int key = 17;
    System.out.println(BinarySearch(arr, key));
  }
}
