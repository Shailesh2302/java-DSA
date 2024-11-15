
import java.util.ArrayList;
public class n_Of_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

       int element = list.get(1);
       System.out.println(element);

        for (int i = 0; i < 11; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
