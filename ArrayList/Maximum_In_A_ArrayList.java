import java.util.ArrayList;
public class Maximum_In_A_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            
            max = Math.max(list.get(i) , max);
        }
        System.out.println(max);

    }
}
