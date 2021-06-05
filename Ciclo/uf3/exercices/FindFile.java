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

public class FindFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userPath = scanner.nextLine();
        String userFile = scanner.next();
        Path path = Paths.get(userPath);
        Stream<Path> allFiles = Files.walk(path);
        List<Path> list = allFiles.collect(Collectors.toList());
        for (Path file: list){
            Path newPath = file.resolve(userFile);
            boolean exists = Files.exists(newPath);
            if (exists)
                System.out.println(newPath);
        }
    }
}
/*
Fes un programa que donat un path i un nom de fitxer, miri si hi ha algun fitxer a dins el path amb aquest nom (mirar a dins de carpetes també).
Per cada ocurrencia, imprimeix el path per pantalla.

Input
/home/user/
file.txt
output
file.txt
gsad1/dsa/file.txt
zsa/file.txt
 */