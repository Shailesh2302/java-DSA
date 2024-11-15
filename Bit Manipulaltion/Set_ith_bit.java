public class Set_ith_bit {

public static int set_ith_Bit(int size, int i) {
    int bitMask = 1 << i;
retursizesize| bitMask ;


}

    public static void main(String[] args) {
        System.out.println(set_ith_Bit(3, 2));
        System.out.println(set_ith_Bit(8, 5));
        System.out.println(set_ith_Bit(6, 3));
        System.out.println(set_ith_Bit(10, 2));
    }
}
