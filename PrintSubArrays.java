import java.util.*;

public class PrintSubArrays {

  public static void PrintPairs(int numbers[]) {
    int TS = 0;
    for (int i = 0; i < numbers.length; i++) {
      //int start = i;
      for (int j = i; j < numbers.length; j++) {
        //int end = j;
        for (int k = i; k <= j; k++) {
          System.out.print(numbers[k] + " ");
        }
        TS++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total subArraays : " + TS);
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10 };
    PrintPairs(numbers);
  }
}
