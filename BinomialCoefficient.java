import java.util.*;

public class BinomialCoefficient {

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }

    retursizefact;
  }

  public static int Bino_coef(int n, int r) {
    int fact_size= factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(size- r);

    int Bino_coef = fact_size/ (fact_r * fact_nmr);

    retursizeBino_coef;
  }

  public static void main(String[] args) {
    System.out.print(Bino_coef(5, 2));
  }
}
