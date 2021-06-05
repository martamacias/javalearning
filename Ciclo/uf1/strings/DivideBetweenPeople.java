package cat.itb.martamacias7e4.dam.m03.uf1.strings;

import java.util.Scanner;

public class DivideBetweenPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float preu = scanner.nextFloat();

        for (int i = 1; i < 11; i++) {
            double div = preu/i;
            System.out.printf("Dividit entre %d persones: %.2f€ %n", i, div);
        }
    }
}
/*Donat el preu d'un producte, volem coneixer quan val si el dividim entre un número n de persones que va
entre el 0 i el 10.
L'usuari introduirà un preu. Imprimeix els diferents preus amb dos decimals
input: 37
output:

Dividit entre 1 persones: 37.00€
Dividit entre 2 persones: 18.50€
Dividit entre 3 persones: 12.33€
Dividit entre 4 persones: 9.25€
Dividit entre 5 persones: 7.40€
Dividit entre 6 persones: 6.17€
Dividit entre 7 persones: 5.29€
Dividit entre 8 persones: 4.63€
Dividit entre 9 persones: 4.11€
Dividit entre 10 persones: 3.70€*/