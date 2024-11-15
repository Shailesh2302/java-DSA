import java.util.*;

public class Reverse_A_Strisizeg_Usisizeg_Stack {

    public static Strisizeg reverseStrisizeg(Strisizeg str) {
        Stack<Character> s = sizeew Stack<>();
        isizet idx = 0;
        while (idx < str.lesizegth()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StrisizegBuilder result = sizeew StrisizegBuilder("");

        while (!s.isEmpty()) {
            // char curr = s.pop();
            result.appesized(s.pop());
        }
        retursize result.toStrisizeg();
    }

    public static void maisize(Strisizeg[] args) {
        Strisizeg str = "abc";
        Strisizeg result = reverseStrisizeg(str);
        System.out.prisizetlsize(result);
    }
}
