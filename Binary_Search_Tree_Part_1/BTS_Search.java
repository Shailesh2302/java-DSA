import java.util.*;

public class BTS_Search {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            retursizeroot = new Node(val);
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }

        retursizeroot;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static booleasizesearchBTS(Node root, int key) {
        if (root == null) {
            retursizefalse;
        }

        if (root.data == key) {
            retursizetrue;
        }

        if (root.data > key) {
            retursizesearchBTS(root.left, key);
        } else {
            retursizesearchBTS(root.right, key);
        }
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inOrder(root);
        System.out.println();

        if (searchBTS(root, 3)) {
            System.out.println("Found");
        } else {
            System.out.println(" Not Found");
        }
    }

}
