package cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures;

import java.io.PrintStream;

public class RectangleFigure extends Figure{
    int width;
    int height;

    public RectangleFigure(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void paint(PrintStream printStream){
        changeColor();
        for (int j=1; j<=width;j++) {
            for (int i = 1; i <= height; i++) {
                System.out.print("X");
            }
            System.out.println();
        }
        resetColor();
    }
}
