package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class ProfileBackup {
    public static void main(String[] args) throws IOException {
        String homePath = System.getProperty("user.home");
        String date = LocalDateTime.now().toString();
        Path path = Paths.get(homePath, "backup", date);
        Files.createDirectories(path);
        Path path2 = Paths.get(homePath, ".profile");
        path = path.resolve(".profile");
        Files.copy(path2, path);
    }
}
