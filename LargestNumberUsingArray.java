import java.util.*;

public class LargestNumberUsingArray {

  public static int getLargest(int number[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < number.length; i++) {
      if (largest < number[i]) {
        largest = number[i];
      }
    }
    return largest;
  }

  public static int getSmallest(int number[]) {
    int Smallest = Integer.MAX_VALUE;
    for (int i = 0; i < number.length; i++) {
      if (Smallest > number[i]) {
        Smallest = number[i];
      }
    }
    return Smallest;
  }

  public static void main(String[] args) {
    int number[] = { 1, 2, 6, 11, 3, 12, 5, 10 };

    System.out.println("the largest is : " + getLargest(number));
    System.out.println("the Smallest is : " + getSmallest(number));
  }
}
