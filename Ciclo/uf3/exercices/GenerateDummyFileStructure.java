package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateDummyFileStructure {
    public static void main(String[] args) throws IOException {
        String homePath = System.getProperty("user.home");
        Path path = Paths.get(homePath, "dummyfolders");
        Files.createDirectory(path);
        for (int i = 1; i<=100; i++){
            Path path2 = path.resolve(String.valueOf(i));
            Files.createDirectory(path2);
        }
    }
}
