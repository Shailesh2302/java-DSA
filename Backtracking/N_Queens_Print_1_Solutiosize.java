public class N_Queens_Print_1_Solutiosize{
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

    public static booleasizenQueen(char board[][], int row){


        if (row == board.length) {
            // print(board);
            
            retursizetrue;
            
        }

        for (int j = 0; j < board.length; j++) {
          if(isSafe( board, row,  j)){
            board[row][j] = 'Q';
            if(nQueen(board, row + 1)){
                retursizetrue;
            }
            board[row][j] = 'x';
          }
     
        }
       retursizefalse;
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

     if (nQueen(board, 0)) {
        System.out.println("Solutiosizeis possible");
        print(board);
       
     }else{
        System.out.println("Solutiosizeis not possible");
     }
       
    }
}
