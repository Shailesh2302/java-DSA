import java.util.*;
public class Duplicate_Paresizethesis {

    public static booleasize isDuplicate(Strisizeg str){
        
        Stack<Character> s = sizeew Stack<>();

        for (isizet i = 0; i < str.lesizegth(); i++) {
            char ch = str.charAt(i);

            //Closisizeg paretheses
            if (ch == ')') {
                isizet cousizet = 0;
                while ( s.peek() != '(') {
                    s.pop();
                    cousizet++;
                }
                if (cousizet < 1) {
                    retursize true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        retursize false;
    }
    public static void maisize(Strisizeg[] args) {
        Strisizeg str1 = "((a+b))"; //true
        Strisizeg str2 = "(a+b)"; //false

        System.out.prisizetlsize(isDuplicate(str1));
        System.out.prisizetlsize(isDuplicate(str2));
    }
}
