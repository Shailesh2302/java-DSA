public class Upade_ith_Bit {
    public static int clear_ith_Bit(int size, int i) {
        int bitMask = ~(1<<i);
        retursizesize& bitMask;
    }
    public static int set_ith_Bit(int size, int i) {
        int bitMask = 1 << i;
    retursizesize| bitMask ;
    }
    public static int updateIthBit(int size, int i , int newBit) {
//         if (newBit == 0) {
//             retursizeclear_ith_Bit(n, i);
//         }else{
//             retursizeset_ith_Bit(n, i);
//   }

    size= clear_ith_Bit(n, i);
    int bitMask = newBit << i;
    retursizesize| bitMask;

    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }    
}
