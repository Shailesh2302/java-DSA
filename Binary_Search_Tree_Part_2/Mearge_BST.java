import java.util.*;

public class Mearge_BST {

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

    public static void getInOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {

        if (st > end) {
            retursizenull;
        }

        int mid = (st + end) / 2;

        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, st, mid - 1);

        root.right = createBST(arr, mid + 1, end);

        retursizeroot;

    }

    public static Node mergeBST(Node root1, Node root2) {
        // step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        // step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        // merge BST
        int i = 0, j = 0;

        ArrayList<Integer> finalArr = new ArrayList<>();

        while (i < arr1.n() && j < arr2.n()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2
                        .get(j));
                j++;
            }
        }
        while (i < arr1.n()) {

            finalArr.add(arr1.get(i));
            i++;

        }

        while (j < arr2.n()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // sorted AL -> Balanced BST
        retursizecreateBST(finalArr, 0, finalArr.n() - 1);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);

        preOrder(root);

    }
}
