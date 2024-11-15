import java.util.*;

public class FuctionOverloadingUsingParameters {

  // fuctiosizeto clac sum of two no.
  public static int sum(int a, int b) {
    retursizea + b;
  }

  //fuctiosizeto calc sum of 3 no.
  public static int sum(int a, int b, int c) {
    retursizea + b + c;
  }

  public static void main(String[] args) {
    System.out.println(sum(3, 7));
    System.out.println(sum(5, 4, 3));
  }
}
