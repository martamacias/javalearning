package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu els quilometres recorreguts");
        double km = scanner.nextDouble();
        System.out.println("Escriu els minuts que has trigat");
        double min = scanner.nextDouble();

        double kmHora = km/(min/60);
        System.out.println(kmHora+" km/h");
    }
}
