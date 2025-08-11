package day17.Task1_2;

public enum chessPiece {

    KING_WHITE(100,"♔"),
    KING_BLACK(100,"♚"),
    QUEEN_WHITE(9,"♕"),
    QUEEN_BLACK(9,"♛"),
    ROOK_WHITE(5,"♖"),
    ROOK_BLACK(5,"♜"),
    BISHOP_WHITE(3.5,"♗"),
    BISHOP_BLACK(3.5,"♝"),
    HORSE_WHITE(3,"♘"),
    HORSE_BLACK(3,"♞"),
    PAWN_WHITE(1,"♙"),
    PAWN_BLACK(1,"♟"),
    EMPTY(-1,"_");
    private double value;
    private String skin;

    chessPiece(double value, String skin) {
        this.value = value;
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

}
