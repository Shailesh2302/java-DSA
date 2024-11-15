import java.util.*;

public class MaxSubArraySumBruteForce {

  public static void maxSubArraySumBruteForce(int arr[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += arr[k];
        }
        System.out.println(currSum);
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.print(" max sum : " + maxSum);
  }

  public static void main(String[] args) {
    int[] arr = { 1, -2, 6, -1, 3 };
    maxSubArraySumBruteForce(arr);
  }
}
