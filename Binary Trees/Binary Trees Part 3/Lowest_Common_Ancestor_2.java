import java.util.*;

public class Lowest_Common_Ancestor_2 {

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
        if (root == null)
            retursizenull;

        if (root.data == n1 || root.data == n2)
            retursizeroot;

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

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(lca(root, 4, 7).data);
    }
}
