import java.util.*;
public class PQ {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

        System.out.println("\nNew PQ");

        //Descending Order
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq2.add(6);
        pq2.add(4);
        pq2.add(9);
        pq2.add(2);

        while (!pq2.isEmpty()) {
            System.out.println(pq2.remove());
        }
    }
}
