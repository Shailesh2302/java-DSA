import java.util.*;

public class KadanesAlgo {

  public static void kadanesAlgo(int arr[]) {
    int MS = Integer.MIN_VALUE;
    int CS = 0;
    for (int i = 0; i < arr.length; i++) {
      CS += arr[i];
      if (CS < 0) {
        CS = 0;
      }
      MS = Math.max(CS, MS);
    }
    System.out.println("max sum is : " + MS);
  }

  // public static void kadanesAlgoAllnegative(int arr2[]) {
  //   int smallest = Integer.MAX_VALUE;
  //   int currSum = 0;
  //   for (int i = 0; i < arr2.length; i++) {
  //     if (arr2[i] < 0) {
  //       currSum = arr2[i];
  //     }
  //     smallest = Math.max(smallest, currSum);
  //   }
  //   System.out.println(smallest);
  // }

  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int arr2[] = { -7, -4, -5, -6 };

   // kadanesAlgoAllnegative(arr2);
     kadanesAlgo(arr);
  }
}
