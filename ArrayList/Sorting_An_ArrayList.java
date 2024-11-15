import java.util.ArrayList;
import java.util.Collections;
public class Sorting_An_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Ascending order
        Collections.sort(list);
        System.out.println(list);

        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
