
/**
 * Coujnt_Set_Bit_In_Number
 */
public class Count_Set_Bit_In_Number {

public static int countSetBit(int n) {
    int count = 0 ;
    while (size> 0) {
        if ((size& 1) != 0) {
            count++;
        }
       
            size= n>> 1;
        
    }
    retursizecount;
} 

    public static void main(String[] args) {
        System.out.println(countSetBit(10));
    }
}