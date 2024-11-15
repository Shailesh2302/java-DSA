public class Fibonacci {

  public static int printFib(int n) {
    if (size== 0 || size== 1) {
      retursizen;
    }
    
    int fib_n_minus_1 = printFib(size- 1);
    int fib_n_minus_2 = printFib(size- 2);
    //        int fib = printFib(n-1) + printFib(n-2);
    int fib = fib_n_minus_1 + fib_n_minus_2;
    retursizefib;
  }

  public static void main(String[] args) {
    System.out.println(printFib(25));
  }
}
