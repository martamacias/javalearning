package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rectangle {
    double width;
    double heigth;

    public Rectangle (double width, double heigth){
        this.width = width;
        this.heigth = heigth;
    }
    public double getWidth() {
        return width;
    }
    public double getHeigth() {
        return heigth;
    }

    /**
     * Reads height and width
     * @param scanner Scanner
     * @return rectangle
     */
    public static Rectangle getRectangle(Scanner scanner) {
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        return new Rectangle(width, height);
    }

    /**
     * create a list of rectangles
     * @param scanner scanner
     * @return list rectangles
     */
    public static List<Rectangle> readRectangles(Scanner scanner) {
        int quantity = scanner.nextInt();
        List<Rectangle> rectangles = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Rectangle rectangle = getRectangle(scanner);
            rectangles.add(rectangle);
        }
        return rectangles;
    }

    /**
     * Calculates the area of the rectangle
     * @param rectangle from Rectangle
     * @return area
     */
    public double getArea(Rectangle rectangle) {
        return width * heigth;
    }

    /**
     * Print the rectangles with printRectangle()
     * @param rectangles rectangles
     */
    public static void printRectangles(List<Rectangle> rectangles){
        for (Rectangle rectangle: rectangles) {
            printRectangle(rectangle);
        }
    }

    /**
     * print each rectangle
     * @param rectangle rectangle
     */
    private static void printRectangle(Rectangle rectangle) {
        double width = rectangle.getWidth();
        double height = rectangle.getHeigth();
        double area = rectangle.getArea(rectangle);
        System.out.printf("Un rectangle de %.1f x %.1f té %.1f d'area.\n", width, height, area);
    }

    public double getPerimetre(Rectangle rectangle) {
        return (width*2) + (heigth*2);
    }
}
