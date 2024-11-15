public class InsertionSort5 {

  public static void insertionSort5(int arr[]) {
    for (int index = 1; index < arr.length; index++) {
      int curr = arr[index];
      int prev = index - 1;
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      arr[prev + 1] = curr;
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 7, 6, 9, 8, 2, 3, 7, 4, 1, 0 };
    insertionSort5(arr);
    printArray(arr);
  }
}
