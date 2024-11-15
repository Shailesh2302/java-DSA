
/**
 * has_path
 */

import java.util.*;

public class has_path {

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

    static void createGraph(ArrayList<Edge> grath[]) {
        for (int i = 0; i < grath.length; i++) {
            grath[i] = new ArrayList<>();

        }
        grath[0].add(new Edge(0, 1, 1));
        grath[0].add(new Edge(0, 2, 1));

        grath[1].add(new Edge(1, 0, 1));
        grath[1].add(new Edge(1, 3, 1));

        grath[2].add(new Edge(2, 0, 1));
        grath[2].add(new Edge(2, 4, 1));

        grath[3].add(new Edge(3, 1, 1));
        grath[3].add(new Edge(3, 4, 1));
        grath[3].add(new Edge(3, 5, 1));

        grath[4].add(new Edge(4, 2, 1));
        grath[4].add(new Edge(4, 3, 1));
        grath[4].add(new Edge(4, 5, 1));

        grath[5].add(new Edge(5, 3, 1));
        grath[5].add(new Edge(4, 1, 1));
        grath[5].add(new Edge(5, 6, 1));

        grath[6].add(new Edge(6, 5, 1));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {

        if (src == dest) {
            return true;
        }
        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest = neighbour
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println(hasPath(graph, 0, 5, new boolean[7]));

    }

}