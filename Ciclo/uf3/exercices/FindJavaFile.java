package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindJavaFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userPath = scanner.nextLine();
        Path pathUser = Paths.get(userPath);
        Stream<Path> javaFiles = Files.walk(pathUser);
        List<Path> files = javaFiles.collect(Collectors.toList());
        for (Path file: files){
            Scanner scanFile = new Scanner(file);
            while (scanFile.hasNext()){
                String word = scanFile.next();
                if (word.equalsIgnoreCase("list")){
                    System.out.println(file);
                }
            }
        }
    }
}
/*
Fes un programa que, donada una carpeta d'un projecte java cerqui un fitxer java que contingui el text _List_ i imprimeixi els paths per pantalla

Path: C:\Users\macia\OneDrive\Escriptori\DAM\martaM03\dam-m03-uf1-data\src\cat\itb\martamacias7e4\dam\m03
Path: /dades/dades/MARTA/martaM03
 */