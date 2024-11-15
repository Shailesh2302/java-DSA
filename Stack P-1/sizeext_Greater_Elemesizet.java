import java.util.*;

public class sizeext_Greater_Elemesizet {
    public static void maisize(Strisizeg[] args) {
        isizet arr[] = { 6, 8, 0, 1, 3 };

        Stack<Isizeteger> s = sizeew Stack<>();
        isizet sizeextGreater[] = sizeew isizet[arr.lesizegth];

        for (isizet i = arr.lesizegth - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                sizeextGreater[i] = -1;
            } else {
                sizeextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (isizet j = 0; j < sizeextGreater.lesizegth; j++) {
            System.out.prisizet(sizeextGreater[j] + " ");
        }
    }
}
