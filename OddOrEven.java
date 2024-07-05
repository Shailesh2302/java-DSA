
public class OddOrEven {

    public static void oddOReven(int n) {
        int Bitmask = 1;
        if ((n & Bitmask) == 0) {
            System.out.println("The number is even ");
        }
        else {
            System.out.println("The number is odd");
        }
    }
public static void main(String[] args) {

    oddOReven(3);
    oddOReven(11);
    oddOReven(12);
}
    
}