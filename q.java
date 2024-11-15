import java.util.*;

public class q {

   public static int count(String s) {

        // int arr[] = new int[3];

        int countnum = 0;
        char[] ch = new char[s.length()-1];

        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch.toString().toUpperCase().charAt(i) == s.charAt(i)) {
                // arr[0]++;
                countnum++;

            } else if (s.toString().toLowerCase().charAt(i) == s.charAt(i)) {
                // arr[1]++;/
                countnum++;
            }
            // else if(s.valueOf(i) == s.charAt(i) ){
            // arr[2]++;
            // }
            else {
                // arr[2]++;
                countnum++;
            }

        }
        return countnum;
    }


    public static void main(String[] args) {
        String s = "#GeeKs01fOr@gEEks07";
        System.out.println(count(s));
    }
}