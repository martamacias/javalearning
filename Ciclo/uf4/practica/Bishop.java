package cat.itb.martamacias7e4.dam.m03.uf4.practica;

public class Bishop extends ChessPiece{

    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public String getPieceString() {
        return "♝";
    }

    @Override
    boolean canMove(int i, int j, int i2, int j2) {
        return Math.abs(i-i2) == Math.abs(j-j2);
    }
}
