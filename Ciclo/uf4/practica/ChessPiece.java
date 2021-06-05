package cat.itb.martamacias7e4.dam.m03.uf4.practica;

import cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures.ConsoleColors;

public abstract class ChessPiece{
    boolean white;

    public ChessPiece(boolean white) {
        this.white = white;
    }
    public void paint(String piece){
        if (white){
            System.out.print(ConsoleColors.YELLOW);
        }else{
            System.out.print(ConsoleColors.BLUE);
        }
        System.out.print(piece);
        System.out.print(ConsoleColors.RESET);
    }
    public abstract String getPieceString();
    abstract boolean canMove(int i, int j, int i2, int j2);
}
