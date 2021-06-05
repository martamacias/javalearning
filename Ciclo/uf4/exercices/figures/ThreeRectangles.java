package cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures;

public class ThreeRectangles {
    public static void main(String[] args) {
        RectangleFigure rectangleFigure = new RectangleFigure(ConsoleColors.RED, 4, 5);
        rectangleFigure.paint(System.out);

        RectangleFigure rectangleFigure2 = new RectangleFigure(ConsoleColors.YELLOW, 2, 2);
        rectangleFigure2.paint(System.out);

        RectangleFigure rectangleFigure3 = new RectangleFigure(ConsoleColors.GREEN, 3, 5);
        rectangleFigure3.paint(System.out);

    //    color: RED, llargada: 4, amplada: 5
    //    color: YELLOW, llargada: 2, amplada: 2
    //    color: GREEN, llargada: 3, amplada: 5
    }
}
/*
Crea un subpackage nou figures

Volem fer programa que dibuixi rectangles de colors a la consola.

Volem que dibuixi els següents 3 rectanlges.

color: RED, llargada: 4, amplada: 5
color: YELLOW, llargada: 2, amplada: 2
color: GREEN, llargada: 3, amplada: 5

Crea la classe RectangleFigure

Colors
Per pintar amb colors a la consola, primer copia la següent classe que conté la definició de colors.
/*
public class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset
    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    Per imprimir amb un color has d'usar:

        System.out.println(ConsoleColors.RED + "RED COLORED" +
        ConsoleColors.RESET + " NORMAL");
        Output (sense colors)
        XXXXX
        XXXXX
        XXXXX
        XXXXX

        XX
        XX

        XXXXX
        XXXXX
        XXXXX
 */