package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EssayAnalyser {
    public static void main(String[] args) throws IOException {
        Scanner general = new Scanner(System.in);
        String input = general.nextLine();
        Path file = Paths.get(input);
        Scanner scanLine = new Scanner(file);
        int totalWords = 0;
        int totalLines = 0;
        while (scanLine.hasNextLine()){
            String line = scanLine.nextLine();
            totalLines++;
            int words = line.split(" ").length;
            totalWords+= words;
        }
        System.out.printf("Número de línies: %d %nNúmero de paraules: %d", totalLines, totalWords);
    }
}
/*
Volem fer un programa que, donat un fitxer de text ens indiqui quantes línies té i quantes paraules té.

Input
/home/user/somefile.txt
Output
Número de línies: 56
Número de paraules: 524
 */