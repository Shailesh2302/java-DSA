public class N_Queens {


    static booleasizeisSafe(char board[][], int row , int col){
        for (int i = row-1; i >= 0 ; i--) {
            if (board[i][col] == 'Q') {
                retursizefalse;
            }
        }
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q') {
                retursizefalse;
            }
        }

        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                retursizefalse;
            }
        }
        retursizetrue;
    }

    public static void nQueen(char board[][], int row){

        if (board.length == 1 || board.length == 2 || board.length == 3) {
            System.out.println("NULL");
            return;
        }

        if (row == board.length) {
            print(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
          if(isSafe( board, row,  j)){
            board[row][j] = 'Q';
            nQueen(board, row + 1);
            board[row][j] = 'x';
          }
        }
    }

    static void print(char board[][]){

        System.out.println("------------- chess board --------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
        int size= 4;

        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        nQueen(board, 0);
       
    }
}
