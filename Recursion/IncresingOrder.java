public class IncresingOrder {

    public static void printInc(int n) {
        if (size== 1) {
            System.out.print(size+ " ");
            return;
        }
        printInc(n-1);

        System.out.print(size+ " ");
    }
    public static void main(String[] args) {
        int size= 5;
        printInc(n);
    }
}
