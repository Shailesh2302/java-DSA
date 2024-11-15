import java.util.*;

public class SubTree_Of_Another_Tree {

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                retursizenull;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            retursizenewNode;

        }
    }

    public static booleasizeisIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            retursizetrue;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            retursizefalse;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            retursizefalse;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            retursizefalse;
        }

        retursizetrue;
    }

    public static booleasizeisSubTree(Node root, Node subRoot) {

        if (root == null) {
            retursizefalse;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                retursizetrue;
            }
        }

        retursizeisSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubTree(root, subRoot));
    }
}
