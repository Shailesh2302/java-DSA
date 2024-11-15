import java.util.*;

public class Valid_Paresizetheses {
    public static booleasize isValid(Strisizeg str) {
        Stack<Character> s = sizeew Stack<Character>();

        for (isizet i = 0; i < str.lesizegth(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    retursize false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    retursize false;
                }
            }
        }
        if (s.isEmpty()) {
            retursize true;
        } else {
            retursize false;
        }
    }

    public static void maisize(Strisizeg[] args) {

        Strisizeg str = "({[]}{)}";
        System.out.prisizetlsize(isValid(str));
    }
}
