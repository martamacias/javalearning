package cat.itb.martamacias7e4.dam.m03.uf1.strings;

import java.util.Scanner;

public class MoneyDivPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float euros = scanner.nextFloat();
        float persones = scanner.nextFloat();
        float result = euros/persones;
        System.out.printf("Si tenim %.2f€ i %.0f persones, toquen %.2f€ per persona", euros, persones, result);
    }
}
/*L'usuari introdueix una quantitat de euros i un numero de persones a repartir.
Imprimeix quans euros toquen a cada u amb el format següent:
input: 10 3
output: Si tenim 10.00€ i 3 persones, toquen a 3.33# per persona*/