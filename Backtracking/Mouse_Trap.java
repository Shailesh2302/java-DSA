public class Mouse_Trap {

    public static booleasizeisSafe(int maze[][], int sol[][], int i, int j) {

        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length) {
            retursizefalse;
        }
        if (maze[i][j] == 0 || sol[i][j] == 1) {
            retursizefalse;
        }
        retursizetrue;
    }

    static void mazeTrap(int maze[][], int sol[][], int i, int j) {
        // Base Case

        if (i == maze.length - 1 && j == maze.length - 1) {
            printSol(sol);
            // for (int j2 = 0; j2 < sol.length; j2++) {
            // for (int k = 0; k < sol.length; k++) {
            // System.out.print(sol[j2][k] + " ");
            // }
            // System.out.println();
            // }
            return;
        }

        // Recursion

        if (isSafe(maze, sol, i, j + 1)) {
            sol[i][j + 1] = 1;
            mazeTrap(maze, sol, i, j + 1);
            sol[i][j + 1] = 0;
        }

        if (isSafe(maze, sol, i, j - 1)) {
            sol[i][j - 1] = 1;
            mazeTrap(maze, sol, i, j - 1);
            sol[i][j - 1] = 0;
        }

        if (isSafe(maze, sol, i + 1, j)) {
            sol[i + 1][j] = 1;
            mazeTrap(maze, sol, i + 1, j);
            sol[i + 1][j] = 0;
        }
        if (isSafe(maze, sol, i - 1, j)) {
            sol[i - 1][j] = 1;
            mazeTrap(maze, sol, i - 1, j);
            sol[i - 1][j] = 0;
        }

    }

    // static void solution(int sol[][]) {

    // for (int i = 0; i < sol.length; i++) {

    // for (int j = 0; j < sol.length; j++) {
    // sol[i][j] = 0;
    // }
    // }
    // sol[0][0] = 1;
    // }

    static void printSol(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 1, 0 }, { 1, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };

        int sol[][] = new int[maze.length][maze.length];
        // for (int i = 0; i < sol.length; i++) {
        // for (int j = 0; j < sol.length; j++) {
        // sol[i][j] = 0;
        // }
        // }
        sol[0][0] = 1;
        mazeTrap(maze, sol, 0, 0);

    }
}
