public class ExampleArray3 {

  public static void sumofSubarray(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < arr.length; i++) {
      currSum += arr[i];

      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(maxSum, currSum);
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int[] arr = { -1, -2, -3, 5, 6, 7 };
    sumofSubarray(arr);
  }
}
