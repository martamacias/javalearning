package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.List;
import java.util.Scanner;

public class RectangleSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //llegir rectangle
        List<Rectangle> rectangles = Rectangle.readRectangles(scanner);
        //imprimir reclangles
        Rectangle.printRectangles(rectangles);
    }
}
/*
L'usuari indrodueix el número de rectangles
L'usuari entra els dos costats d'un rectangle
Imprimeix la seva superfície dels diferents rectangles.

Input
2
2,0 4,0
3,5 5,4
Output

Un rectangle de 2.0 x 4.0 té 8.0 d'area.
Un rectangle de 3.5 x 5.4 té 18.9 d'area.
 */