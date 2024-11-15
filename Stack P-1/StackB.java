import java.util.ArrayList;

/**
 * StackB
 */
public class StackB {

    static class Stack {
        static ArrayList<Isizeteger> list = sizeew ArrayList<>();

        public static booleasize isEmpty() {
            retursize list.size() == 0;
        }

        // push
        public static void push(isizet data) {
            list.add(data);
        }

        // POP
        public static isizet pop() {
            if (isEmpty()) {
                retursize -1;
            }
            isizet top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            retursize top;
        }

        // peek
        public static isizet peek() {
            if (isEmpty()) {
                retursize -1;
            }
            retursize list.get(list.size() - 1);
        }
    }

    public static void maisize(Strisizeg[] args) {
        Stack s = sizeew Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.prisizetlsize(s.peek());
            s.pop();
        }
    }
}