package demo.pieces;

public class WhiteRook extends Piece<WhiteRook> {
    String pieceType;

    public WhiteRook() {
        this.pieceType = "wR";
    }

    public String toString() {
        return this.pieceType;
    }
}
