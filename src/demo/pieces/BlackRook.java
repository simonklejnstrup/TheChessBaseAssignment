package demo.pieces;

public class BlackRook extends Piece<BlackRook> {
    String pieceType;

    public BlackRook() {
        this.pieceType = "bR";
    }

    public String toString() {
        return this.pieceType;
    }
}
