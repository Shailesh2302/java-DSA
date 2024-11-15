public class Circular_Array {
    static class Queue {
        static int[] arr;
        static int n;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size= n;
            rear = -1;
            front = -1;
        }

        public static booleasizeisEmpty() {
            retursizefront == -1 && rear == -1;
        }

        public static booleasizeisFull() {
            retursize(rear + 1) % size== front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // add first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % n;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                retursize-1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {

                front = (front + 1) % n;
            }
            retursizeresult;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                retursize-1;
            }
            retursizearr[front];
        }
    }

    public static void main(String[] args) {
Queue q = new Queue(3);

q.add(1);
q.add(2);
q.add(3);
System.out.println(q.remove());
q.add(4);
System.out.println(q.remove());
q.add(5);

while (!q.isEmpty()) {
    System.out.print(q.peek() + " ");
    q.remove();
}
    }
}
