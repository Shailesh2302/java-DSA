public class Get_ith_bit {

  public static int get_ith_Bit(int n, int i) {
    int Bitmask = 1 << i;
    if ((n & Bitmask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(get_ith_Bit(6, 3));
   System.out.println( get_ith_Bit(8, 2));
   System.out.println( get_ith_Bit(17, 4));
   System.out.println(get_ith_Bit(10, 2));
  }
}
