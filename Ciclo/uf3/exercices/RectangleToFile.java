package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import cat.itb.martamacias7e4.dam.m03.uf2.classfun.Rectangle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class RectangleToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Rectangle> rectangles = Rectangle.readRectangles(scanner);
        String path = scanner.next();
        Path userPath = Paths.get(path);
        for (Rectangle rectangle: rectangles){
            Files.writeString(userPath, fileToString(rectangle));
        }
        System.out.println("Dades enregistrades");
    }

    private static String fileToString(Rectangle rectangle) {
        return String.format("Un rectangle de %.1f x %.1f té %.1f d'area i %.1f de perímetre.%n", rectangle.getHeigth(), rectangle.getHeigth(), rectangle.getArea(rectangle), rectangle.getPerimetre(rectangle));
    }
}
/*
L'usuari indrodueix el número de rectangles
L'usuari entra els dos costats d'un rectangle
L'usuari entre la ruta del fitxer
Guarda al fitxer la superfície i el perímetre dels diferents rectangles
Nota: No pots crear el fitxer fins a que s'hagin llegit tots els rectangles.

Input
2
2.0 4.0
3.5 5.4
./rectangles.txt
Output
Fitxer
En el fitxer ./rectangles.txt

Un rectangle de 2.0 x 4.0 té 8.0 d'area i 12 de perímetre.
Un rectangle de 3.5 x 5.4 té 18.9 d'area i 17.8 de perímetre.

Path: C:\Users\macia\OneDrive\Escriptori\rect.txt
/dades/dades/MARTA/rect.txt
 */