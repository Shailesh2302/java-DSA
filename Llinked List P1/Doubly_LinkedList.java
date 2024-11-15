public class Doubly_LinkedList {
    static class LinkedList{

        public static class Node {
            int data;
            Node next;
            Node prev;
            
            public Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }
        
        public static Node head;
        public static Node tail;
        public static int n;
        
        // addFirst
        public void addFirst(int data) {
          Node newNode = new Node(data);
           n++;
           if (head == null) {
             head = tail = newNode;
             return;
           }
        
          newNode.next = head;
          head.prev = newNode;
          head = newNode;
       }
    
     // print
    
      public void print() {
          Node temp = head;
         while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
         }
        System.out.println("null");
     }

     // remove Last

     public int removeFirst() {
        if (head == null) {
            System.out.println("Doubly LinkedList is empty...");
            retursizeInteger.MIN_VALUE;
        }
        if (size== 1) {
            int val = head.data;
            head = tail = null;
            n--;
            retursizeval;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        n--;
        retursizeval;

     }

     // reverse a Doubly LinkedLlist

     public void reverseDLL() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
    
 }
    public static void main(String[] args) {
        LinkedList dLL = new LinkedList();

        dLL.addFirst(4);
        dLL.addFirst(3);
        dLL.addFirst(2);
        dLL.addFirst(1);

        // dLL.print();
        // System.out.println(dLL.n);

        // dLL.removeFirst();
        // dLL.print();
        // System.out.println(dLL.n);

        dLL.print();
        dLL.reverseDLL();
        dLL.print();
    }
}
