package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import cat.itb.martamacias7e4.dam.m03.uf2.classfun.Rectangle;

public class RectangleSizesFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner user = new Scanner(System.in);
        String userPath = user.nextLine();
        File file = new File(userPath);

        Scanner scanner = new Scanner(file);
        List<Rectangle> rectangles = Rectangle.readRectangles(scanner);
        for (Rectangle rectangle : rectangles) {
            double area = rectangle.getArea(rectangle);
            double perimetre = rectangle.getPerimetre(rectangle);
            System.out.printf("Un rectangle de %.1f x %.1f té %.1f d'area i %.1f de perímetre.%n", rectangle.getWidth(), rectangle.getHeigth(), area, perimetre);
        }
    }
}
/*
L'usuari introduirà el path al fitxer amb els rectangles.
Imprimeix la superfície i el perímetre dels diferents rectangles.

Notes

No pots imprimir els rectangles fins a que s'hagin llegit tots.
Mira't l'exercici ja resolt RectangleSize de la UF2. Reutilitza tant codi com puguis.
Input
./rectangles.txt
Output
Un rectangle de 2.0 x 4.0 té 8.0 d'area i 12 de perímetre.
Un rectangle de 3.5 x 5.4 té 18.9 d'area i 17.8 de perímetre.

Path: C:\Users\macia\OneDrive\Escriptori\hola\rectangles.txt
 */