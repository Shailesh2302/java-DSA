import java.util.ArrayList;
public class Pair_Sum_1 {

    public static boolean pair(ArrayList<Integer> list, int tar){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == tar) {
                    System.out.println(i+", "+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        int target = 5;
        System.out.println(pair(list, target));
    }
}
