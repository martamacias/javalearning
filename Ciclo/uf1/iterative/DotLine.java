package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class DotLine {
    public static void main(String[] args) {
        //Demana un enter a l'usuari.
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        //Imprimeix per pantalla tants punts com l'usuari hagi indicat

        String i = ".";
        int y;
        for (y=1;x>=y;y++) {
            System.out.print(i);
        }
    }
}