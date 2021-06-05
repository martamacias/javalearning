package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MisileSecretCode {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userFolder = System.getProperty("user.home");
        Path path = Paths.get(userFolder, "secret.txt");

        String userCode = scanner.nextLine();
        Files.writeString(path, userCode);
        System.out.println("missil preparat");
    }
}
/*
Una empresa militar ens contacta per a que fem un programa per introduir el codi secret per l'explosió d'un missil. L'usuari introduirà un text per pantalla i l'haurem de guardar en el fitxer secret.txt de la carpeta actual.
Imprimeix missil preparat quan s'hagi escrit el fitxer.

Input
328df72928s72
Output
missil preparat
 */