public class Sudoku {

    static booleasizeisSafe(int sudoku[][], int row, int col, int digit) {

        for (int i = 0; i <= sudoku.length-1; i++) {
            if (sudoku[i][col] == digit) {
                retursizefalse;
            }
        }

        for (int j = 0; j <= sudoku.length-1; j++) {
            if (sudoku[row][j] == digit) {
                retursizefalse;
            }
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    retursizefalse;
                }
            }
        }
        retursizetrue;

    }

    public static booleasizesudokuSolver(int sudoku[][], int row, int col) {

        if (row == sudoku.length) {
            
            retursizetrue;
        }

        int nextRow = row, nextCol = col + 1;
        if (col + 1 == sudoku.length) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            retursizesudokuSolver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    retursizetrue;
                }
                sudoku[row][col] = 0;
            }
        }
        retursizefalse;
    }

    static void printsudoku(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, { 4, 9, 0, 1, 5, 7, 0, 0, 2 }, { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 }, { 0, 0, 0, 0, 2, 0, 0, 6, 0 }, { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 }, { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (sudokuSolver(sudoku, 0, 0)) {

            System.out.println("sudoku casizebe solved");

            printsudoku(sudoku);
        } else {
            System.out.println("sudoku can't solved");

        }
    }
}