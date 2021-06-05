package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RenameAsCapitalLetter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        Path path = Paths.get(user);
        Stream<Path> allFiles = Files.walk(path);
        List<Path> list = allFiles.collect(Collectors.toList());
        for (Path file: list){
            File oldFile = new File(file.toString());
            File newFile = new File(file.toString().toLowerCase());
            oldFile.renameTo(newFile);
        }
    }
}
