import java.io.*;
import java.util.*;

public class ReverseTheNumber {
    public static void main(String args[]) {

        int size= 108999;
        int rev = 0;

        while (size> 0) {
            int LastDigit = size% 10;
            rev = (rev * 10) + LastDigit;
            size= size/ 10;
        }
        System.out.println(rev);
    }
}
