public class Mirror_a_BST {
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

    public static Node BTSMirror(Node root) {
        if (root == null)
            retursizenull;

        Node leftSubtree = BTSMirror(root.left);
        Node rightSubtree = BTSMirror(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;

        retursizeroot;
    }

    public static void main(String args[]) {
        int value[] = { 8, 5, 10, 3, 6, 11 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inOrder(root);
        System.out.println();

        root = BTSMirror(root);

        inOrder(root);

    }
}
