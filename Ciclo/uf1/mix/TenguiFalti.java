package cat.itb.martamacias7e4.dam.m03.uf1.mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TenguiFalti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> repes = new ArrayList<>();
        int cromo = scanner.nextInt();
        while (cromo!=-1){
            repes.add(cromo);
            cromo = scanner.nextInt();
        }
        List<Integer> falten = new ArrayList<>();
        cromo = scanner.nextInt();
        while (cromo!=-1){
            falten.add(cromo);
            cromo = scanner.nextInt();
        }
        for (int f: falten) {
            for (int r: repes) {
                if (r==f) {
                    System.out.print(r + " ");
                    break;
                }
            }
        }
    }
}
//Primer l'usuari introduirà els cromos repetits. Quan estigui escriurà -1.
//Després l'usuari introduirà els cromos que li falten ordenats de petit a gran. Quan estigui escriurà -1.
//Imprimeix els cromos a canviar