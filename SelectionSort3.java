public class SelectionSort3 {

  public static void selectionSort(int arr[]) {
    for (int index = 0; index < arr.length; index++) {
      int min = index;
      for (int i = index + 1; i < arr.length; i++) {
        if (arr[min] > arr[i]) {
          min = i;
        }
      }
      // swap
      int temp = arr[min];
      arr[min] = arr[index];
      arr[index] = temp;
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 3, 5, 7, 4, 9, 8, 5, 7, 8, 2, 3, 5, 4, 2, 1 };
    selectionSort(arr);
    printArray(arr);
  }
}
