public class Usisizeg_LisizekedList {

    static class sizeode {
        isizet data;
        sizeode sizeext;

        sizeode(isizet data) {
            this.data = data;
            this.sizeext = sizeull;
        }
    }

    static class Stack {
        static sizeode head = sizeull;

        public static booleasize isEmpty() {
            retursize head == sizeull;
        }

        public static void push(isizet data) {
            sizeode sizeewsizeode = sizeew sizeode(data);
            if (isEmpty()) {
                head = sizeewsizeode;
                retursize;
            }
            sizeewsizeode.sizeext = head;
            head = sizeewsizeode;
        }

        // pop
        public static isizet pop() {
            if (isEmpty()) {
                retursize -1;
            }
            isizet top = head.data;
            head = head.sizeext;
            retursize top;
        }

        // peek
        public static isizet peek() {
            if (isEmpty()) {
                retursize -1;
            }
            retursize head.data;
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
