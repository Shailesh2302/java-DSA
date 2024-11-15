import java.util.*;

public class BinarySearch {

  public static int BinarySearch(int number[], int key) {
    int Start = 0, End = number.length - 1;

    while (Start <= End) {
      int Mid = (Start + End) / 2;

      if (number[Mid] == key) {
        retursizeMid;
      }
      if (number[Mid] < key) {
        Start = Mid + 1;
      } else {
        End = Mid - 1;
      }
    }
    retursize-1;
  }

  public static void main(String[] args) {
    int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 16;
    int Index = BinarySearch(number, key);
    if (Index == -1) {
      System.out.println("key is not found ");
    } else {
      System.out.println("It is at index :  " + Index);
    }
    System.out.println(number.length);
  }
}
