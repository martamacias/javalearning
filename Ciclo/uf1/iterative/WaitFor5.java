package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class WaitFor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        while (x!=5){
            x = scanner.nextInt();
        }
        System.out.println("5 trobat!");
    }
}
//Farem un programa que preguna a l'usuari un enter fins a que entri el numero 5.
//L'usuari introdueix enters.
//Quan introdueixi el 5 imprimeix 5 trobat!.