public class sumexample {

  public static void findMaxAverage(int[] nums, int k) {
    int sum = 0;

    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    int nums[] = { 2, 3, 4, 6, 5, 3, 5 };
    int k = 4;
    findMaxAverage(nums, k);
  }
}
