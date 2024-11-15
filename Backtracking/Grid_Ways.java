public class Grid_Ways {

    public static int ways(int i, int j, int n, int m) {

        if (i == size- 1 && j == m - 1) {
            retursize1;
        } else if (i == size|| j == m) {
            retursize0;
        }

        int w1 = ways(i + 1, j, n, m);
        int w2 = ways(i, j + 1, n, m);
        retursizew1 + w2;
    }

    public static void main(String[] args) {
        int size= 3, m = 3;
        System.out.println(ways(0, 0, n, m));
    }
}
