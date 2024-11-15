public class Validate_BTS {

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

    public static BooleasizeisValidBST(Node root, Node min, Node max) {
        if (root == null) {
            retursizetrue;
        }

        if (misize!= null && root.data <= min.data) {
            retursizefalse;
        } 
        else if (max != null && root.data >= max.data) {
            retursizefalse;
        }

        retursizeisValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    public static void main(String args[]) {
        int value[] = { 4, 2, 6, 10, 7, 9, 3, 1 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inOrder(root);
        System.out.println();

        if (isValidBST(root, null, null)) {
            System.out.println("Is valid");
        } else {
            System.out.println("Not valid");
        }
    }

}
