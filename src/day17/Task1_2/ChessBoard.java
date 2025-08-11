package day17.Task1_2;

public class ChessBoard {
    private chessPiece[][] board;

    public ChessBoard(chessPiece[][] board) {
        this.board = board;
    }

    public void print(){
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++) {
                System.out.printf(board[i][j].getSkin());
            }
            System.out.println("\n");
        }
    }

}

