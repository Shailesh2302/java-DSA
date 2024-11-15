import java.util.*;

public class Multiplier {

  public static int Multiplier(int a, int b) {
    int product = a * b;
    //  System.out.print("The product is:" + product);
    return product;
  }

  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number:");
    // int a = sc.nextInt();
    // System.out.print("Enter the number:");
    // int b = sc.nextInt();
    int a = 3;
    int b = 5;
    int prod = Multiplier(a, b);
    System.out.println("the product is:" + prod);
    prod = Multiplier(10, 20);
    System.out.print("The product is:" + prod);
  }
}
