package cat.itb.martamacias7e4.dam.m03.uf3.exercices.generalexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileCounterLog {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userPath = getPath(scanner);
        Path path = Paths.get(userPath, "counterlog.txt");
        Files.createFile(path);

        List<Path> listFiles = filesCounter(userPath);
        int countFiles = listFiles.size();
        writeInFile(countFiles, userPath, path);
    }

    private static void writeInFile(int countFiles, String userPath, Path path) throws IOException {
        System.out.println("S'agefirà al fitxer ~/counterlog.txt la següent línia");
        String date = LocalDateTime.now().toString();
        String line = date + " - Tens " +countFiles+ " fitxers a " + userPath;
        System.out.println(line);
        Files.writeString(path, line);
    }

    private static List<Path> filesCounter(String userPath) throws IOException {
        Path path = Paths.get(userPath);
        Stream<Path> allFiles = Files.walk(path);
        return allFiles.collect(Collectors.toList());
    }

    private static String getPath(Scanner scanner) {
        return scanner.nextLine();
    }
}