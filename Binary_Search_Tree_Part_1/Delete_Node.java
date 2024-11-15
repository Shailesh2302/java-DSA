import java.util.*;

public class Delete_Node {
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

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                retursizenull;
            }
            if (root.left == null) {
                retursizeroot.right;
            } else if (root.right == null) {
                retursizeroot.left;
            }
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        retursizeroot;
    }

    public static Node findInOrderSuccessor(Node root) {
        if (root.left != null) {
            retursizeroot.left;
        }
        retursizeroot;
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inOrder(root);
        System.out.println();

        root = delete(root, 10);

        inOrder(root);
    }
}
