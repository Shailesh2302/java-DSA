public class BubbleSort3 {

  public static void bubblesort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
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
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 9, 6, 3, 2, 6, 8, 9, 5 };
    bubblesort(arr);
    printArray(arr);
  }
}
