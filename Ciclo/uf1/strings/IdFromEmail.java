package cat.itb.martamacias7e4.dam.m03.uf1.strings;

import java.util.Scanner;

public class IdFromEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correu = scanner.nextLine();

        for (int i = 0; i < correu.length(); i++) {
            char x = correu.charAt(i);
            if (x!='@'){
                System.out.print(x);
            }else {
                break;
            }
        }
    }
}
/*Donat un correu electrònic printa per pantalla l'identificador de l'usuari dins del domini:

input: mar.om@example.com
output: mar.om*/