class Solution {
    public static int findCenter(int[][] edges) {
        int n = edges.length;
        int[][] adjList = new int[10001][];
        int node = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (adjList[u] == null) adjList[u] = new int[10000];
            if (adjList[v] == null) adjList[v] = new int[10000];

            adjList[u][++adjList[u][0]] = v;
            adjList[v][++adjList[v][0]] = u;

            node = Math.max(node, u);
            node = Math.max(node, v);
        }

        for (int i = 1; i <= node; i++) {
            if (adjList[i] != null && adjList[i][0] == n) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int edges[][] = { { 1, 2 }, { 2, 3 }, { 4, 2 } };

        System.out.println(findCenter(edges));
    }
}
