package demo.pieces;

public class BlackBishop extends Piece<BlackBishop> {
    String pieceType;

    public BlackBishop() {
        this.pieceType = "bB";
    }

    public String toString() {
        return this.pieceType;
    }
}
