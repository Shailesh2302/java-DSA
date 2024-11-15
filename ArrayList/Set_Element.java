import java.util.ArrayList;

public class Set_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);

        // Set Element at index

        list.set(3, 18);

        System.out.println(list);
    }
}
