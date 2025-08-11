package day17.Task1_2;


public class Task1 {
    public static void main(String[] args) {
        chessPiece[] figures = {
                chessPiece.PAWN_WHITE, chessPiece.PAWN_WHITE, chessPiece.PAWN_WHITE, chessPiece.PAWN_WHITE,
                chessPiece.ROOK_BLACK, chessPiece.QUEEN_BLACK, chessPiece.ROOK_BLACK, chessPiece.ROOK_BLACK
        };
      //  for (chessPiece figure : figures)
        //    System.out.println(figure.getSkin());

        ChessBoard board = new ChessBoard(new chessPiece[][]{
                {chessPiece.ROOK_BLACK, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY,
                        chessPiece.ROOK_BLACK, chessPiece.KING_BLACK, chessPiece.EMPTY},
                {chessPiece.EMPTY, chessPiece.ROOK_WHITE,
                        chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.PAWN_BLACK, chessPiece.PAWN_BLACK, chessPiece.EMPTY, chessPiece.PAWN_BLACK},
                {chessPiece.PAWN_BLACK, chessPiece.EMPTY, chessPiece.HORSE_BLACK, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.PAWN_BLACK,
                        chessPiece.EMPTY},
                {chessPiece.QUEEN_BLACK, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.BISHOP_WHITE, chessPiece.EMPTY, chessPiece.EMPTY,
                        chessPiece.EMPTY, chessPiece.EMPTY},
                {chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.BISHOP_BLACK, chessPiece.PAWN_WHITE,
                        chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY},
                {chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY,
                        chessPiece.BISHOP_WHITE, chessPiece.PAWN_WHITE, chessPiece.EMPTY, chessPiece.EMPTY},
                {chessPiece.PAWN_WHITE, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.QUEEN_WHITE,
                        chessPiece.EMPTY, chessPiece.PAWN_WHITE, chessPiece.EMPTY, chessPiece.PAWN_WHITE},
                {chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY, chessPiece.EMPTY,
                        chessPiece.ROOK_WHITE, chessPiece.KING_WHITE, chessPiece.EMPTY}
        });
        board.print();
    }
}
