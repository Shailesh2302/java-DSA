public class CountingSort {

  public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {
      4,
      5,
      3,
      5,
      2,
      7,
      8,
      5,
      3,
      0,
      6,
      4,
      6,
      8,
      5,
      7,
      2,
      9,
      7,
      1,
      1,
      0,
      10,
    };
    countingSort(arr);
    printArray(arr);
  }
}
