package demo.pieces;

public class WhiteBishop extends Piece<WhiteBishop> {
    String pieceType;

    public WhiteBishop() {
        this.pieceType = "wB";
    }

    public String toString() {
        return this.pieceType;
    }
}
