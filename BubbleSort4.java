public class BubbleSort4 {

  public static void bubblesort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 6, 2, 1, 8, 7, 5, 3, 1 };
    bubblesort(arr);
    printArray(arr);
  }
}
