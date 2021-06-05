package cat.itb.martamacias7e4.dam.m03.uf1.strings.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<String> input = new ArrayList<>();
        String paraula = scanner.next();
       /* while (!paraula.equals("END")){
            input.add(paraula);
            paraula = scanner.next();
        }
        System.out.println(input);*/
        while (!paraula.equals("END")) {
            String frase = paraula.replace("**", "\u001B[1m")
                    .replace("--", "\u001B[3m")
                    .replace("++", "\u001B[0m")
                    .replace("//r//", "\u001B[31m")
                    .replace("//g//", "\u001B[32m")
                    .replace("//b//", "\u001B[34m")
                    .replace("//s//", "\u001B[39m");
            System.out.print(frase + " ");
            paraula = scanner.next();
        }

    }
}
/*mplementar un programa que llegeixi línies de l'entrada en format Markdown i les analitze sintàcticament (parser).
Aquest parser té els següents formats:

** (\u001B[1m): Inici negreta
-- (\u001B[3m): Inici cursiva
++ (\u001B[0m): Final format (esborra tots els formats aplicats).
A més, suporta colors mitjançant el format //color//, on color és el color que vols posar:

r (\u001B[31m): Vermell
g (\u001B[32m): Verd
b (\u001B[34m): Blau
s (\u001B[39m): Reset (color per defecte)
*/

//Aquest text permet inserir format, com per ejemple **text en negreta++ o --text cursiva++. A més, podem posar colors, com el //r//vermell//s//. També es poden **//g//combinar colors i estils//s//++.
