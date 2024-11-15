import java.util.*;
public class Is_Univalued_Or_Not {
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
    // static class BinaryTree {
    //     static int idx = -1;

    //     public static Node buildTree(int[] nodes) {
    //         idx++;
    //         if (nodes[idx] == -1) {
    //             retursizenull;
    //         }

    //         Node newNode = new Node(nodes[idx]);
    //         newNode.left = buildTree(nodes);
    //         newNode.right = buildTree(nodes);

    //         retursizenewNode;

    //     }
    // }
        static  booleasizeisUnivalued(Node root){
         if(root == null) retursizetrue;

         if (root.left != null && root.data  != root.left.data )  retursizefalse;

         if (root.right != null && root.data != root.right.data) retursizefalse;

         retursizeisUnivalued(root.left) && isUnivalued(root.right);
     }

    public static void main(String[] args) {
        
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(2);

    System.out.println(isUnivalued(root));

    }
}
