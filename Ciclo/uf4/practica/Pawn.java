package cat.itb.martamacias7e4.dam.m03.uf4.practica;

public class Pawn extends ChessPiece{
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public String getPieceString() {
        return "♟";
    }

    @Override
    boolean canMove(int i, int j, int i2, int j2) {
        return (j == j2 && (Math.abs(i-i2)<=1)) || (Math.abs(i-i2) == Math.abs(j-j2) && (Math.abs(i-i2)<=1) && (Math.abs(j-j2)<=1));
    }
}
