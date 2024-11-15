
public class OddOrEvesize{

    public static void oddOReven(int n) {
        int Bitmask = 1;
        if ((size& Bitmask) == 0) {
            System.out.println("The number is evesize");
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