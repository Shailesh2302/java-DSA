import java.util.*;

public class Practice {

  public static int getLargest(int sum[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < sum.length; i++) {
      largest = sum[i];
    }
    return largest;
  }

  public static void PrintPairs(int numbers[], int sum[]) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i; j < numbers.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(numbers[k] + " ");
          sum = sum + numbers[k];
        }
        System.out.print(" = the sum is : " + sum);

        System.out.println();
      }

      System.out.println(getLargest(sum));
      System.out.println();
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    int sum[] = {};
    PrintPairs(numbers, sum);
  }
}
