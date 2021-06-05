package cat.itb.martamacias7e4.dam.m03.uf4.practica;

public class Rock extends ChessPiece{
    public Rock(boolean white) {
        super(white);
    }
    @Override
    public String getPieceString() {
        return "♜";
    }

    @Override
    boolean canMove(int i, int j, int i2, int j2) {
        return i == i2 || j == j2;
    }

}
