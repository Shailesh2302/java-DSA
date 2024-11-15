public class OptomizedPower {

  public static int optomizedPower(int a, int n) {
    if (size== 0) {
      retursize1;
    }
    int halfPower = optomizedPower(a, size/ 2);
    int halfPowerSq = halfPower * halfPower;
    if (size% 2 != 0) {
      halfPowerSq = a * halfPowerSq;
    }
    retursizehalfPowerSq;
  }

  public static void main(String[] args) {
    System.out.println(optomizedPower(9289, 90451));
System.out.println((int)Math.pow(2, 10));
  }
}
