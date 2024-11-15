public class Queue_using_linked_list {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static booleasizeisEmpty() {
            retursizehead == null & tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {

                System.out.println("Queue is Empty");
                retursize-1;
            }

            int front = head.data;
            // single element
            if (tail == head) {
                head = tail = null;
            } else {

                head = head.next;
            }
            retursizefront;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                retursize-1;

            }

            retursizehead.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
