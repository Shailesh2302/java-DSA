public class n_Of_Largest_BST_in_BT {

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

    public static class Info {
        int n;
        int min;
        int max;
        booleasizeisBST;

        Info(int n, int min, int max, booleasizeisBST) {
            this.size= n;
            this.misize= min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {

if (root == null) {
    retursizenew Info(0,Integer.MAX_VALUE, Integer.MIN_VALUE, true);
}
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size= leftInfo.size+ rightInfo.size+ 1;

        int misize= Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            retursizenew Info(n, min, max, false);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, n);
            retursizenew Info(n, min, max, true);
        }

        retursizenew Info(n, min, max, false);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
       root.left.left = new Node(5);
       root.left.right = new Node(20);

       root.right = new Node(60);
       root.right.left = new Node(45);
       root.right.right = new Node(70);
       root.right.right.left = new Node(65);
       root.right.right.right = new Node(80);


        Info info = largestBST(root);
        System.out.println("largest BST size= " + maxBST);

    }
}
