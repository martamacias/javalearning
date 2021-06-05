package cat.itb.martamacias7e4.dam.m03.uf1.strings.practice;

import java.util.Scanner;

public class RepositoryName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modul = scanner.nextInt();
        int unit = scanner.nextInt();
        String correu = scanner.next();
        String name = correu.replace(".", "");
        for (int i = 0; i < correu.length(); i++) {
            char letter = name.charAt(i);
            if (letter!='@'){
                System.out.print(letter);
            }else {
                break;
            }
        }
        System.out.printf("-dam-m%02d-uf%d", modul, unit);
        //System.out.printf("");
    }
}
/*Implementar un programa que donat el número del mòdul, el número de la unitat formativa i el correu electrònic de l'ITB d'un alumne,
ens calcule quin serà el nom del repositori de Git.

El número del mòdul ha de tindre 2 xifres sempre, omplint amb 0's a l'esquerre si escau.

input
3 1 nom.cognom.7e4@itb.cat
output
nomcognom7e4-dam-m03-uf1*/