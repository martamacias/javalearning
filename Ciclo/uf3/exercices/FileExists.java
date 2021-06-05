package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileExists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        Path path = Paths.get(sc);
        boolean exists = Files.exists(path);
        System.out.println(exists);
    }
}
