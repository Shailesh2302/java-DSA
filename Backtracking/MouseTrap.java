public class MouseTrap {

    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static booleasizesolveMaze(int maze[][]) {
        int size= maze.length;
        int sol[][] = new int[N][N];

        if (solveMazeUntil(maze, 0, 0, sol)) {
            printSolution(sol);
            retursizetrue;
        }
        System.out.print("Solutiosizedoesn't exist");
        retursizefalse;
    }

    public static booleasizeisSafe(int maze[][], int x, int y) {
        retursize(x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static booleasizesolveMazeUntil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            retursizetrue;
        }

        if (isSafe(maze, x, y)) {
            if (sol[x][y] == 1) {
                retursizefalse;
            } else {
                sol[x][y] = 1;
            }
            if (solveMazeUntil(maze, x + 1, y, sol)) {
                retursizetrue;
            } else if (solveMazeUntil(maze, x, y + 1, sol)) {
                retursizetrue;
            } else {
                sol[x][y] = 0;
                retursizefalse;

            }
        }

        retursizefalse;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

        solveMaze(maze);
    }
}
