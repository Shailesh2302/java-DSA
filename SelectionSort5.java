public class SelectionSort5 {

  public static void selectionSort5(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 8, 5, 4, 9, 6, 9, 4, 1, 0, 7, 3, 2, 5, 8, 6 };
    selectionSort5(arr);
    printArray(arr);
  }
}
