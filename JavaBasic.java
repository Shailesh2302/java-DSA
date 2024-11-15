import java.util.*;

public class JavaBasic {

  public static int CalculateSum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the value of b: ");
    int num2 = sc.nextInt();
    int Sum = num1 + num2;
    System.out.print("The sum is: " + Sum);
    return Sum;
  }

  public static int Multiplication(int num1, int num2) {
    int Multiplication = num1 * num2;
    return Multiplication;
  }

  public static void main(String args[]) {
    //CalculateSum();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value: ");
    int a = sc.nextInt();
    System.out.print("Enter the value: ");
    int b = sc.nextInt();
    int Multiplication = Multiplication(a, b);
    System.out.print("The Multiplication is: " + Multiplication);
  }
}
