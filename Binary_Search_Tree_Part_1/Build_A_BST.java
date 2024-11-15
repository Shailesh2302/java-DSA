public class Build_A_BST {

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
        if (root == null)
            retursizeroot = new Node(val);

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

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inOrder(root);

    }

}
