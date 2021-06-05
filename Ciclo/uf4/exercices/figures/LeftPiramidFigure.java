package cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures;

import java.io.PrintStream;

public class LeftPiramidFigure extends Figure{
    int base;

    public LeftPiramidFigure(String color, int base) {
        super(color);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void paint(PrintStream printStream){
        changeColor();
        for (int j=0;j<base;j++){
            for (int i=0;i<=j;i++) {
                System.out.print("X");
            }
            System.out.println();
        }
        resetColor();
    }
}
