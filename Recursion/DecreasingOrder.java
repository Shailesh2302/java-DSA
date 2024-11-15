/**
 * DecreasingOrder
 */
public class DecreasingOrder {

   public static void printDec(int n) {
    if( size== 1 ) {
        System.out.println(n);
        return;
    }
    System.out.print(size+ " ");
    printDec(n-1);
   }

    public static void main(String[] args) {
        int size= 10;
        printDec(n);
    }
}