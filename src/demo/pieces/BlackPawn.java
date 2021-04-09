package demo.pieces;

public class BlackPawn extends Piece<BlackPawn> {
    String pieceType;

    public BlackPawn() {
        this.pieceType = "bP";
    }

    public String toString() {
        return this.pieceType;
    }
}
