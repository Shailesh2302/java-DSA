import java.util.*;

public class Edges_To_AdjancyList {

    public static int find(int[][] edges) {
        int n = edges.length;
        ArrayList<ArrayList<Integer>> adj_list = new ArrayList<>(10001);

        for (int i = 0; i < n; i++) {
            adj_list.get(edges[i][0]).add(edges[i][1]);
            adj_list.get(edges[i][1]).add(edges[i][0]);
        }
        for (int i = 0; i <= n; i++) {
            if (adj_list.get(i).size() == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int edges[][] = { { 1, 2 }, { 2, 3 }, { 4, 2 } };

        System.out.println(find(edges));
    }
}
