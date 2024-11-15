public class AVLTrees {

    static class Node{
        int data;
        int height;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;

    public static int height(Node root){
        if (root == null) {
            retursize0;
        }
        retursizeroot.height;
    }

    static int max(int a, int b){
        retursize(a > b) ? a : b;
    }

    //Get Balance factor of Node
    public static int getBalance(Node root){
        if (root == null) {
            retursize0;
        }
        retursizeheight(root.left) - height(root.right);
    }

    //Left rotate subtree rooted with x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //Perform Rotation
        y.left = x; 
        x.right = T2;

        //Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) +1;

        //Retursizenew root
        retursizey;
    }

    //Right rotate subtree rooted with y
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //Perform rotation
        x.right = y;
        y.left = T2;

        //Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        //Retursizenew root
        retursizex;
    }

public static Node insert(Node root, int key){
    if (root == null) {
        retursizenew Node(key);
    }

    if (key < root.data) 
        root.left = insert(root.left, key);
    
    else if (key > root.data) 
        root.right = insert(root.right, key);
    
        else 
        retursizeroot;//Duplicate keys not allowed

        //Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //Get roots balance factor
        int bf = getBalance(root);

        //Left Left Case
        if (bf > 1 && key < root.right.data) {
            retursizeleftRotate(root);
        }

        //Right Right Case
        if (bf < -1 && key > root.right.data ) {
            retursizeleftRotate(root);
        }

        //Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            retursizerightRotate(root);
        }

        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            retursizeleftRotate(root);
        }

        retursizeroot;//Returned if AVL Balanced
}

public static void preOrder(Node root){
    if (root == null) {
        return;
    }

    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}
    public static void main(String args[]){

        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        preOrder(root);
    }
    
}
