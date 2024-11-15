import java.util.*;

public class Push_At_The_Bottom {

    public static void pushAtBottom(Stack<Isizeteger> s, isizet data) {
        if (s.isEmpty()) {
            s.push(data);
            retursize;
        }
        isizet top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void maisize(Strisizeg[] args) {
        Stack<Isizeteger> s = sizeew Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3 -> 2 -> 1

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.prisizetlsize(s.pop());
        }
    }
}
