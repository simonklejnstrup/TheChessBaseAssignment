package demo.pieces;

public class BlackKing extends Piece<BlackKing> {
    String pieceType;

    public BlackKing() {
        this.pieceType = "bK";
    }

    public String toString() {
        return this.pieceType;
    }
}
