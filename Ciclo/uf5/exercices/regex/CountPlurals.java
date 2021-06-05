package cat.itb.martamacias7e4.dam.m03.uf5.exercices.regex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountPlurals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = ".+(s$)";
        Pattern pattern = Pattern.compile(regex);
        line.replace(",", "");
        String[] lineSepar = line.split(" ");

        int count = 0;
        for (String word: lineSepar) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()){
                count ++;
            }
        }
        System.out.println(count);
    }
}
/*
Donat una linia de text, conta el nombre de paraules plurals que té. Considerarem plurals totes les paraules que acaben en s.

Input
Lorem ipsum dolors sit amet, consectetur adipisicis elit, sed eiusmod tempors incidunt ut labore et dolores magna aliqua.

Output
4
 */