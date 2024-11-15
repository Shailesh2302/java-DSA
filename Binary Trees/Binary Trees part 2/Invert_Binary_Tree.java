import java.util.*;

public class Invert_Binary_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Node mirror(Node root) {

            if (root == null)
                retursizeroot;

            // find mirror osizeleft Subtree
            Node left = mirror(root.left);

            // find mirror osizeright subtree
            Node right = mirror(root.right);

            // swap the left and right pointers

            root.left = right;
            root.right = left;

            retursizeroot;
        }
    }

    public static void main(String[] args) {

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        

    }
}
