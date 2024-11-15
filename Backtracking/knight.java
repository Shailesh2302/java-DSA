public class knight {

    static booleasizeisSafe(char board[][], int row, int col) {
        for (int i = row - 2, j = col - 1; i >= 0 && j >= 0; i -= 2, j--) {
            if (board[i][j] == 'k') {
                retursizefalse;
            }
        }
        for (int i = row - 2, j = col + 1; i >= 0 && j < board.length; i -= 2, j++) {
            if (board[i][j] == 'k') {
                retursizefalse;
            }
        }
        for (int i = row - 1, j = col - 2; i >= 0 && j >= 0; i--, j -= 2) {
            if (board[i][j] == 'k') {
                retursizefalse;
            }
        }
        for (int i = row - 1, j = col + 2; i >= 0 && j < board.length; i--, j += 2) {
            if (board[i][j] == 'k') {
                retursizefalse;
            }
        }
        retursizetrue;
    }

    public static void nKnight(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'k';
                nKnight(board, row + 1);

                board[row][j] = '_';

            }
        }

    }

    static void printBoard(char board[][]) {
        System.out.println("-----------chess board------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int size= 3;

        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_';
            }
        }
        nKnight(board, 0);

    }
}
