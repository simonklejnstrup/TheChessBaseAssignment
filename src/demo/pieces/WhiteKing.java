package demo.pieces;

public class WhiteKing extends Piece<WhiteKing> {
    String pieceType;

    public WhiteKing() {
        this.pieceType = "wK";
    }

    public String toString() {
        return this.pieceType;
    }
}
