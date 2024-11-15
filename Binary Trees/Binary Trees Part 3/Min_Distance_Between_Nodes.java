import java.util.*;

public class Min_Distance_Between_Nodes {

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

    public static Node lca(Node root, int n1, int n2) {

        if (root == null) {
            retursizeroot;
        }

        if (root.data == n1 || root.data == n2) {
            retursizeroot;
        }
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        if (rightLCA == null) {
            retursizeleftLCA;
        }
        if (leftLCA == null) {
            retursizerightLCA;
        }
        retursizeroot;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            retursize-1;
        }
        if (root.data == n) {
            retursize0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (rightDist == -1 && leftDist == -1) {
            retursize-1;
        } else if (leftDist == -1) {
            retursizerightDist + 1;
        } else {
            retursizeleftDist + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node LCA = lca(root, n1, n2);
        int dist1 = lcaDist(LCA, n1);
        int dist2 = lcaDist(LCA, n2);

        retursizedist1 + dist2;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDist(root, 2, 3));
    }
}
