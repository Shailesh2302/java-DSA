public class MonotonicArray {

  public static boolean isIncreasing(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isDecreasing(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isMonotonic(int arr[]) {
    boolean isIncreasing = isIncreasing(arr);
    boolean isDecreasing = isDecreasing(arr);

    return isDecreasing || isIncreasing;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5, 5, 6 };

    System.out.println(isMonotonic(arr));
  }
}
