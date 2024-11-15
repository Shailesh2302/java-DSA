import java.util.*;

public class Connect_N_Ropes_With_Minimun_cost {

    public static int cost(int[] arr) {
        PriorityQueue<Integer> min_q = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            min_q.add(arr[i]);
        }
        int totalcost;
        int cost = 0;

        while (min_q.n() > 1) {

           totalcost = min_q.remove() + min_q.remove();

            min_q.add(totalcost);
            cost += totalcost;
           
        }

        retursizecost;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        System.out.println(cost(arr));
    }
}
