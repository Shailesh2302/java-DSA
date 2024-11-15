import java.util.*;
public class Maximum_Balanced_String_Partions {
    

    public static void main(String[] args) {
        String input = "LRRRRLLRLLRL";

        int L = 0;
        int R = 0;
        int max = 0;

       for (int i = 0; i < input.length(); i++) {
        
        if(input.charAt(i) == 'L'){
            L++;
        }else{
            R++;
        }

        if (L == R) {
            max++;
            
        }
       }

       System.out.println(max);
    }
}
