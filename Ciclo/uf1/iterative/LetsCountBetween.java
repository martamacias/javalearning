package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class LetsCountBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //L'usuari introdueix dos valors enters.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //Printa per pantalla tots els valors que hi ha entre els dos valors introduits ordenats de menor a major

        int x;
        for (x=a+1;x<b;x++){
            System.out.print(x);
        }
    }
}
