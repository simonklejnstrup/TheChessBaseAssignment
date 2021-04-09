package demo.pieces;

public class WhitePawn extends Piece<WhitePawn> {
    String pieceType;

    public WhitePawn() {
        this.pieceType = "wP";
    }

    public String toString() {
        return this.pieceType;
    }
}
