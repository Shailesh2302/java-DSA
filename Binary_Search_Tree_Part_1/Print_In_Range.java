public class Print_In_Range {

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
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void range(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            range(root.left, k1, k2);
            System.out.print(root.data + " ");
            range(root.right, k1, k2);
        } else if (root.data < k1) {
            range(root.left, k1, k2);
        } else {
            range(root.right, k1, k2);
        }
    }

    public static void main(String args[]) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inOrder(root);

        System.out.println();

        range(root, 5, 12);
    }
}
