package cat.itb.martamacias7e4.dam.m03.uf4.practica;

public class Queen extends ChessPiece{
    public Queen(boolean white) {
        super(white);
    }

    @Override
    public String getPieceString() {
        return "♛";
    }

    @Override
    boolean canMove(int i, int j, int i2, int j2) {
        return (i==i2) || (j==j2) || (Math.abs(i-i2) == Math.abs(j-j2));
    }
}
