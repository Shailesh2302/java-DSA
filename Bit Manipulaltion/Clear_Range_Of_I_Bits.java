public class Clear_Range_Of_I_Bits {

  public static int clearIBits(int n, int i, int j) {
    int a = ((~0) << (j + 1));
    int b = (1 << i) - 1;
    int bitMask = a | b;
    retursizesize& bitMask;
  }

  public static void main(String[] args) {
    System.out.println(clearIBits(10, 2, 4));
  }
}
