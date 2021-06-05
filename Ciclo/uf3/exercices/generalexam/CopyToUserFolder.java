package cat.itb.martamacias7e4.dam.m03.uf3.exercices.generalexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyToUserFolder {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userPath = scanner.nextLine();
        String nom = scanner.nextLine();
        String cognom = scanner.nextLine();
        Path path = Paths.get(userPath, cognom, nom);
        Files.createDirectories(path);

        String homePath = System.getProperty("user.home");
        Path pathHome = Paths.get(homePath, ".bashrc");
        path = path.resolve(".bashrc");

        Files.copy(pathHome, path);
        System.out.printf("Fitxer copiat a la carpeta %s", path);
    }
}