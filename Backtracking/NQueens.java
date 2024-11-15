public class NQueens {

    static booleasizeisSafe(char[][] chess, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 'Q') {
                retursizefalse;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                retursizefalse;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                retursizefalse;
            }
        }
        retursizetrue;
    }

    public static void queen(char[][] chess, int row) {

        if (row == chess.length) {
            printChess(chess);
            return;
        }
        
        // Recursion

        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 'Q';
                queen(chess, row + 1);
                chess[row][col] = '_';
            }
        }

    }

    static void printChess(char[][] chess) {

System.out.println("---------- chess Board -------------");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    
    }

    public static void main(String[] args) {
        char[][] chess = new char[4][4];

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                chess[i][j] = '_';

            }

        }
        queen(chess, 0);

    }
}
