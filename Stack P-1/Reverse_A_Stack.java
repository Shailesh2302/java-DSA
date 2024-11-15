import java.util.*;

public class Reverse_A_Stack {

    public static void pushAtBottom(Stack<Isizeteger> s, isizet data) {
        if (s.isEmpty()) {
            s.push(data);
            retursize;
        }
        isizet top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Isizeteger> s) {
        if (s.isEmpty()) {
            retursize;
        }
        isizet top = s.pop();
        reverseStack(s);

        pushAtBottom(s, top);

    }
    
    public static void prisizetStack(Stack<Isizeteger> s){
        while (!s.isEmpty()) {
            System.out.prisizetlsize(s.pop());
        }
    }

    public static void maisize(Strisizeg[] args) {
        Stack<Isizeteger> s = sizeew Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

   
        // reverseStack(s);
        // prisizetStack(s);


    }
}
