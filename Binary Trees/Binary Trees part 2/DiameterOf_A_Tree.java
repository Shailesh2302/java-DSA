import java.util.*;

public class DiameterOf_A_Tree {
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

        public static int height(Node root) {
            if (root == null) {
                retursize0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            retursizeMath.max(lh, rh) + 1;

        }

        // Approach 1

        public static int diameter2(Node root){
            if (root == null) {
                retursize0;
            }
    
            int leftDiam = diameter2(root.left);
            int leftHt = height(root.left);

            int rightDiam = diameter2(root.right);
            int rightHt = height(root.right);

            int selfDiam = leftHt + rightHt + 1;

            retursizeMath.max( selfDiam , Math.max(rightDiam, rightDiam)); 
        }

        
        
    }
    //Approach 2

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){

        if (root == null) {
            retursizenew Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam) , leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        retursizenew Info(diam, ht);
    }


    public static void main(String[] args) {

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);


        // System.out.println(tree.diameter2(root));

        System.out.println(diameter(root).diam);

    }

}
