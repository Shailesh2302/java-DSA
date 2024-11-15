import java.util.*;

public class ArrayAsFuctionArgument {

  public static void update(int marks[]) {
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
      //      System.out.println(marks[i]);
    }
  }

  public static void main(String[] args) {
    int marks[] = { 98, 95, 97 };
    update(marks);

    for (int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + " ");
    }
    System.out.println();
  }
}
