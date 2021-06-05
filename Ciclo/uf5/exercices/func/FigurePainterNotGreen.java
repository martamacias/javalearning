package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures.ConsoleColors;
import cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures.Figure;
import cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures.LeftPiramidFigure;
import cat.itb.martamacias7e4.dam.m03.uf4.exercices.figures.RectangleFigure;

import java.util.ArrayList;
import java.util.List;

public class FigurePainterNotGreen {
    public static void main(String[] args) {
        List<Figure> figures = getListFigures();
        figures.stream()
                .filter(FigurePainterNotGreen::isFigureGreen)
                .forEach(System.out::println);
    }

    private static boolean isFigureGreen(Figure figure) {
        return figure.getColor().equals(ConsoleColors.GREEN);
    }

    private static List<Figure> getListFigures() {
        List<Figure> figures = new ArrayList<>();

        figures.add(new RectangleFigure(ConsoleColors.RED, 4, 5));
        figures.add(new LeftPiramidFigure(ConsoleColors.YELLOW, 3));
        figures.add(new RectangleFigure(ConsoleColors.GREEN, 3, 5));
        figures.add(new RectangleFigure(ConsoleColors.BLUE, 1, 1));
        figures.add(new LeftPiramidFigure(ConsoleColors.YELLOW, 4));
        figures.add(new RectangleFigure(ConsoleColors.GREEN, 10, 5));
        figures.add(new LeftPiramidFigure(ConsoleColors.YELLOW, 8));

        return figures;
    }
}
//Imprimeix per pantalla només les que no siguin verdes.