package cat.itb.martamacias7e4.dam.m03.uf4.practica;

public class Knight extends ChessPiece{
    public Knight(boolean white) {
        super(white);
    }

    @Override
    public String getPieceString() {
        return "♞";
    }

    @Override
    boolean canMove(int i, int j, int i2, int j2) {
        return (i-i2)*(i-i2) +(j-j2)*(j-j2) == 5;
    }
}
