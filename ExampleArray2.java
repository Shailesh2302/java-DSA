public class ExampleArray2 {

  public static void sumofSubarray(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }
    for (int i = 0; i < prefix.length; i++) {
      for (int j = 0; j < prefix.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
      }
      if (maxSum < currSum) {
        maxSum = currSum;
      }
    }
    System.out.println("maxsum is : " + maxSum);
  }

  public static void main(String[] args) {
    int arr[] = { 5, 6, 4, 7, 8, 9, 7, 65, 65, 4, 5, 67, 78, 3 };

    sumofSubarray(arr);
  }
}
