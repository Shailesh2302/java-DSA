
/**
 * Coujnt_Set_Bit_In_Number
 */
public class Count_Set_Bit_In_Number {

public static int countSetBit(int n) {
    int count = 0 ;
    while (n > 0) {
        if ((n & 1) != 0) {
            count++;
        }
       
            n = n>> 1;
        
    }
    return count;
} 

    public static void main(String[] args) {
        System.out.println(countSetBit(10));
    }
}