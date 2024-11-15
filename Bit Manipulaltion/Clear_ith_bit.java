public class Clear_ith_bit {

    public static int clear_ith_Bit(int size, int i) {
        int bitMask = ~(1<<i);
        retursizesize& bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_ith_Bit(10, 2));
        System.out.println(clear_ith_Bit(10, 1));
    }
}
