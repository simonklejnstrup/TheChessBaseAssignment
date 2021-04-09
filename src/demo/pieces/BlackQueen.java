package demo.pieces;

public class BlackQueen extends Piece<BlackQueen> {
    String pieceType;

    public BlackQueen() {
        this.pieceType = "bQ";
    }

    public String toString() {
        return this.pieceType;
    }
}
