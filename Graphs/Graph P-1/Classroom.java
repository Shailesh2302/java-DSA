import java.util.*;

public class Classroom {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge>[] gragh = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            gragh[i] = new ArrayList<>();
        }

        // 0 -> vertex
        gragh[0].add(new Edge(0, 1, 5));

        // 1 -> vertex
        gragh[1].add(new Edge(1, 0, 5));
        gragh[1].add(new Edge(1, 2, 1));
        gragh[1].add(new Edge(1, 3, 3));

        // 2 -> vertex
        gragh[2].add(new Edge(2, 1, 1));
        gragh[2].add(new Edge(2, 3, 1));
        gragh[2].add(new Edge(2, 4, 2));

        // 2 -> vertex
        gragh[3].add(new Edge(3, 1, 3));
        gragh[3].add(new Edge(3, 2, 1));

        // 4 -> vertex
        gragh[4].add(new Edge(4, 2, 2));

        // 2's neighbours

        for (int i = 0; i < gragh[2].size(); i++) {
            Edge e = gragh[2].get(i);
            System.out.println(e.dest);
        }
    }
}
