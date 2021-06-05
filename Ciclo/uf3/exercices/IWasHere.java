package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class IWasHere {
    public static void main(String[] args) throws IOException {
        String userFolder = System.getProperty("user.home");
        String date = LocalDateTime.now().toString();
        Path path = Paths.get(userFolder, "i_was_here.txt");
        Files.writeString(path, "I Was Here: "+date);
    }
}
