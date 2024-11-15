import java.util.*;

public class Swap {

  public static int Swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a);
    System.out.println(b);
    return 0;
  }

  public static int Swap1(int a) {
    a = 10;
    System.out.println(a);
    return a;
  }

  public static int Swap2(int a) {
    a = 10; // this method cant work the value remain into the fuction
    return a;
  }

  public static void main(String args[]) {
    int a = 5;
    int b = 10;

    Swap(a, b);
  }
}
