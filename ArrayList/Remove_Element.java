import java.util.ArrayList;

public class Remove_Element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);

        // Delete or Remove
        list.remove(3);

        System.out.println(list);
    }

}
