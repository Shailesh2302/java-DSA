public class BubbleSort5 {

  public static void bubbleSort5(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void println(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {
      3,
      6,
      3,
      6,
      9,
      0,
      6,
      7,
      8,
      5,
      3,
      6,
      7,
      1,
      5,
      4,
      1,
      0,
      8,
      6,
      4,
      8,
      6,
      2,
      5,
    };
    bubbleSort5(arr);
    println(arr);
  }
}
