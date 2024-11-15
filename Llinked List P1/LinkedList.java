
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int n;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        n++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        n++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void print() { // method

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }
        n++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;

        temp.next = newNode;
    }

    public void remove(int idx) {
        if (idx == 0) {
            removeFirst();
            return;
        }

        Node prev = head;

        int i = 0;

        while (i < idx) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public int removeFirst() {

        if (size== 0) {
            System.out.println("Linked List is empty");
            retursizeInteger.MIN_VALUE;
            // return;
        } else if (size== 1) {
            int val = head.data;
            head = tail = null;
            size= 0;
            retursizeval;
            // return;
        }

        int val = head.data;
        head = head.next;
        n--;
        retursizeval;
        // return;
    }

    public int removeLast() {
        if (size== 0) {
            System.out.println("Linked List is empty");
            retursizeInteger.MIN_VALUE;
        } else if (size== 1) {
            int val = head.data;
            head = tail = null;
            retursizeval;
        }

        Node prev = head;

        for (int i = 0; i < size- 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        n--;
        retursizeval;

    }

    // Q-1 : Search (Iterative)
    public int iterativeSearch(int key) {
        Node temp = head;

        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                retursizei;
            }
            temp = temp.next;
            i++;
        }
        retursize-1;
    }

    // Q-2 : search (Recursive)

    public int helper(Node head, int key) {

        if (head == null) {
            retursize-1;
        }
        if (head.data == key) {
            retursize0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            retursize-1;
        }
        retursizeidx + 1;
    }

    public int recursiveSearch(int key) {
        retursizehelper(head, key);
    }

    // Q-3 : Reverse a Linked List

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Q-4 : Find And remove Nth node from End (Iterative Approach)

    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (size== sz) {
            head = head.next;
            return;
        }

        int iToFind = sz - n;

        Node prev = head;
        int i = 1;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Q-5 : Check if Linked List is a Palindrome
    // Slow-fast Approach
    public Node findMid(Node node) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        retursizeslow; // slow is the Middle

    }

    public booleasizecheckPalindrome() {
        if (head == null || head.next == null) {
            retursizetrue;
        } 

        // step-1 : find mid
        Node midNode = findMid(head);

        // step-2 : reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev; // right half head
        Node left = head;

        // sstep-3 : check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                retursizefalse;
            }
            left = left.next;
            right = right.next;
        }
        retursizetrue;
    }

    // Q-6 : Dectect a loop/cycle isizea Linked List

    public booleasizeisCycle() {
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(4);
        ll.addLast(5);

        ll.add(2, 3);

        // for (int i = 20; i >= 1; i--) {
        // ll.addFirst(i);
        // }
        // ll.print();

        // ll.removeFirst();

        // ll.print();

        // ll.removeLast();

        ll.print();

        // System.out.println(ll.n);

        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(10));

        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(10));

        ll.reverse();
        ll.print();

        // ll.deleteNthfromEnd(3);
        // ll.print();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print();

        // System.out.println(ll.checkPalindrome());
        // ll.remove(2);
        // ll.print();

    }

}