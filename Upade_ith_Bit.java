public class Upade_ith_Bit {
    public static int clear_ith_Bit(int n , int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int set_ith_Bit(int n , int i) {
        int bitMask = 1 << i;
    return n | bitMask ;
    }
    public static int updateIthBit(int n , int i , int newBit) {
//         if (newBit == 0) {
//             return clear_ith_Bit(n, i);
//         }else{
//             return set_ith_Bit(n, i);
//   }

    n = clear_ith_Bit(n, i);
    int bitMask = newBit << i;
    return n | bitMask;

    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }    
}
