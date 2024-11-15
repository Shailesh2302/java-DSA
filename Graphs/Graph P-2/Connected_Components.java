
/**
 * Connected_Components
 */
import java.util.*;

public class Connected_Components {

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

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) { // visit curr
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            dfsUtil(graph, i, vis);
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis) { // O(V+E)
        System.out.println(curr);
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

    }

}