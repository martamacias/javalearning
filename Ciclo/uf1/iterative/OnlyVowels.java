package cat.itb.martamacias7e4.dam.m03.uf1.iterative;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int num = scanner.nextInt();
        List<String> vocals = new ArrayList<>();

        int i = 0;
        while (num > i) {
            String letra = scanner2.nextLine();
            i++;
            switch (letra){
                case "a": case "e": case "i": case "o": case "u": case "A": case "E": case "I": case "O": case "U":
                    vocals.add(letra);
                    break;
                default:
                    break;
            }
        }
        for (String list : vocals){
            System.out.println(list);
        }
    }
}
//Donada una llista de lletres, imprimeix únicament les vocals que hi hagi.
//L'entrada consta de dues parts:
//Primer s'indica la quantitat de lletres
//A continuació venen les lletres separades per espais en blanc
//Imprimeix totes les que són vocals.