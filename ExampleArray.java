public class ExampleArray {

  public static void sumofSubarray(int nums[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          currSum += nums[k];
        }
        if (maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println(maxSum);
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 8, 5, 9, 0, 6, 4, 3 };
    sumofSubarray(nums);
  }
}
