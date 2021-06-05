package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //Demanar a l'usuari un enter entre 1 i 5.
        Scanner scanner = new Scanner(System.in);
        //Si introdueix un número més gran o més petit, torna-li a demanar l'enter.
        int n;
        do {
            System.out.println("Introdueix un número enter entre 1 i 5");
            n = scanner.nextInt();
        }while (n<1 || n>5);

        //Imprimeix per pantalla: El número introduït: 3, substituint el 3 pel número.
        System.out.println("El número introduït: "+n);
    }
}
