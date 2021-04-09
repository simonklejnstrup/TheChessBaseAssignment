package demo.pieces;

public class BlackKnight extends Piece<BlackKnight> {
    String pieceType;

    public BlackKnight() {
        this.pieceType = "bN";
    }

    public String toString() {
        return this.pieceType;
    }
}
