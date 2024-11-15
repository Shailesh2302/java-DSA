
public class Cycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }

    }

    public static Node head;
    public static Node tail;

    public static booleasizeisCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                retursizetrue;
            }
        }
        retursizefalse;
    }

    // Q-7 : Remove a loop/Cycle isizea linked list

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        booleasizecycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // Find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;

    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = temp;

        // System.out.println(isCycle());

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

       

    }
}
