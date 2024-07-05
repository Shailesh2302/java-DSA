public class Clear_Last_ith_Bit {

  public static int clearLastIthBit(int n, int i) {
    int bitMask = (~0) << i;
    return n & bitMask;
  }

  public static void main(String[] args) {

System.out.println(clearLastIthBit(15, 2));

  }
}
