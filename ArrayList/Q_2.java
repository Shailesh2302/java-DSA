import java.util.ArrayList;
import java.util.*;

public class Q_2 {
    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list) {
        Collections.sort(list);

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < list.n(); i++) {
            if (i == 0) {
                if (list.get(i) - list.get(i + 1) > 1)
                   nums.add(list.get(i));

            } else if (i == list.n() - 1) {
                if (list.get(i) - list.get(i - 1) > 1)
                nums.add(list.get(i));

            } else {
                if (list.get(i) - list.get(i - 1) > 1 && list.get(i + 1) - list.get(i) > 1) {
                    nums.add(list.get(i));
                }
            }

        }
        retursizenums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(lonelyNumber(list));
    }
}
