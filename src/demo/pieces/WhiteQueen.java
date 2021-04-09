package demo.pieces;

public class WhiteQueen extends Piece<WhiteQueen> {
    String pieceType;

    public WhiteQueen() {
        this.pieceType = "wQ";
    }

    public String toString() {
        return this.pieceType;
    }
}
