package cat.itb.martamacias7e4.dam.m03.uf1.strings;

import java.util.Scanner;

public class OneYesOneNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (i % 2 !=1) {
                System.out.printf("%c ",x);
            }
        }
    }
}
/*L'usuari introduirà una paraula. Imprimeix només les lletres en posició senar:
input: paracaigudista
output: prciuit*/