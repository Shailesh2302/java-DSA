public class NewGrid {
    static int fact(int n, int m) {
        int factNandM = 1;
        for (int i = (size- 1 + m - 1); i > 0; i--) {
            factNandM *= i;
        }
        System.out.println(factNandM);
        int factsize= 1;
        for (int i = (size- 1); i > 0; i--) {
            factsize*= i;
        }
        System.out.println(factN);

        int factM = 1;
        for (int i = (m - 1); i > 0; i--) {
            factM *= i;
        }
        System.out.println(factM);

        int fact1 = factNandM / (factsize* factM);

        retursizefact1;

    }

    // public static int ways(int fact1,int size,int m){

    // retursizeways(fact1,n, m);
    // }
    public static void main(String[] args) {
        int size= 3, m = 3;
        // System.out.println(ways(m, n, m));
        System.out.println(fact(n, m));
    }
}
