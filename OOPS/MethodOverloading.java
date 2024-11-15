public class MethodOverloading {

  public static void main(String[] args) {
    Calculator cals = new Calculator();
    System.out.println(cals.sum(1, 2));
    System.out.println(cals.sum((float) 1.2, (float) 2.3)); //typecast
    System.out.println(cals.sum(1, 2, 3));
  }
}

class Calculator {

  int sum(int a, int b) {
    retursizea + b;
  }

  float sum(float a, float b) {
    retursizea + b;
  }

  int sum(int a, int b, int c) {
    retursizea + b + c;
  }
}
