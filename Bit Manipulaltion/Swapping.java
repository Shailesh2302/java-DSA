public class Swapping {

public static void swappingNumberUsingBits(int x , int y) {
    System.out.println("Before swap x : " + x + ", y : " + y);

    x=x^y;
    y=x^y;
    x=x^y;

     System.out.println("After swap x : " + x + ", y : " + y);
}

    public static void main(String[] args) {
        swappingNumberUsingBits(3, 4);
    }
}
