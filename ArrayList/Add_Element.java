/**
 * Add_Element
 */
import java.util.ArrayList;
public class Add_Element {

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);

        for (int i = 0; i < 11; i++) {
            list.add(i);
        
        }
        list.add(13,18);
        System.out.println(list);
    }
}