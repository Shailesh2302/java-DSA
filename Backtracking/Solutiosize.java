public class Solutiosize{
    static int size= 8;

    public static booleasizeisSafe(int x, int y, int sol[][]) {
        retursize(x >= 0 && x < size&& y >= 0 && y < size&& sol[x][y] == -1);
    }

    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }

    public static booleasizesolveKT() {
        int sol[][] = new int[8][8];
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };// As the Knight starts from cell(0,0)
        sol[0][0] = 0;
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solutiosizedoes not exist");
            retursizefalse;
        } else
            printSolution(sol);
        retursizetrue;
    }

    public static booleasizesolveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        int k, next_x, next_y;
        if (movei == size* N)
            retursizetrue;
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
                    retursizetrue;
                else
                    sol[next_x][next_y] = -1;
            }
        }
        retursizefalse;
    }

    public static void main(String args[]) {
        solveKT();
    }
}