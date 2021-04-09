package demo.pieces;

public class WhiteKnight extends Piece<WhiteKnight> {
    String pieceType;

    public WhiteKnight() {
        this.pieceType = "wN";
    }

    public String toString() {
        return this.pieceType;
    }
}
