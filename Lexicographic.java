public class Lexicographic {
public static String toGetlargest(String[] fruits) {
    String largest = fruits[0];

    for (int i = 1; i < fruits.length; i++) {
        if (largest.compareTo(fruits[i]) < 0) {
            largest=fruits[i];
        }
    }
    System.out.println(largest);
    return largest;
}

    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
toGetlargest(fruits);
    }
}
