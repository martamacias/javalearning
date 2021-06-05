package cat.itb.martamacias7e4.dam.m03.uf5.exercices.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadSubjectInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quant = scanner.nextInt();
        for (int i = 0; i < quant; i++) {
            printFormatted(scanner);
        }
    }

    private static void printFormatted(Scanner scanner) {
        String info = scanner.next();
        String regex = "(.+)-M(\\d+)UF(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(info);
        while (matcher.find()) {
            String cicle = matcher.group(1);
            String module = matcher.group(2);
            String uf = matcher.group(3);
            System.out.printf("Estàs cursant la unitat formativa %s, del mòdul %s de %s.%n", uf, module, cicle);
        }
        matcher.reset();
    }

}
/*
Volem fer un programa que donat el nom de la UF en un format determinat ens l'imprimeixi en un format amigable per l'usuari.

Input
2
DAM-M03UF2
ASIX-M01UF09

Output
Estàs cursant la unitat formativa 2, del mòdul 3 de DAM.
Estàs cursant la unitat formativa 9, del mòdul 1 de ASIX.
 */