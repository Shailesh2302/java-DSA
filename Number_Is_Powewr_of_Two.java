public class Number_Is_Powewr_of_Two {

  public static boolean isPowerOftwo(int n) {
    return (n & (n - 1)) == 0;
  }

  public static void main(String[] args) {
    System.out.println(isPowerOftwo(4));
    System.out.println(isPowerOftwo(8));
    System.out.println(isPowerOftwo(7));
  }
}