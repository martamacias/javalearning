package cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures;

public class ThreeRectanglesOneLeftPiramid {
    public static void main(String[] args) {
        RectangleFigure rectangleFigure1 = new RectangleFigure(ConsoleColors.RED, 4, 5);
        rectangleFigure1.paint(System.out);

        LeftPiramidFigure leftPiramidFigure1 = new LeftPiramidFigure(ConsoleColors.YELLOW, 3);
        leftPiramidFigure1.paint(System.out);

        RectangleFigure rectangleFigure2 = new RectangleFigure(ConsoleColors.GREEN, 3, 5);
        rectangleFigure2.paint(System.out);
    }
}
/*
Volem fer programa que dibuixi rectangles i piramides (aliniades a l'esquerre) de colors a la consola.

Volem que dibuixi el següent rectanlges.

rectangle: color: RED, llargada: 4, amplada: 5
triangle: color: YELLOW, altura: 3
rectangle color: GREEN, llargada: 3, amplada: 5

Output (sense colors)
XXXXX
XXXXX
XXXXX
XXXXX

X
XX
XXX

XXXXX
XXXXX
XXXXX

 */