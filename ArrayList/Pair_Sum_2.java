import java.util.ArrayList;

public class Pair_Sum_2 {
    public static boolean pair(ArrayList<Integer> list, int tar) {

        int lp = 0, rp = list.size() - 1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == tar) {
                System.out.println(lp + ", " + rp);
                return true;
            }
            if (list.get(lp) + list.get(rp) < tar) {
                lp++;
            } else {
                rp--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            list.add(i * 3);
        }
        System.out.println(pair(list, 27));
    }
}
