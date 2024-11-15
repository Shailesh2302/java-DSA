import java.util.*;

public class Kth_Ancestor_Of_Node {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kAncestor(Node root, int n, int k) {
        if (root == null) {
            retursize-1;
        }

        if (root.data == n) {
            retursize0;
        }

        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            retursize-1;
        }

        int max = Math.max(leftDist, rightDist);

        if (max + 1 == k) {
        System.out.println(root.data);
        }

        retursizemax + 1;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kAncestor(root, 4, 1);
    }
}
