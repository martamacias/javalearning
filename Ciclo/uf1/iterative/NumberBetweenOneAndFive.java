package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class NumberBetweenOneAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enter;
        do {
            System.out.println("Escriu un número entre 1 i 5.");
            enter = scanner.nextInt();
        }while (enter<1 || enter>5);
        System.out.println("El número introduït: "+enter);
    }
}
/*Demanar a l'usuari un enter entre 1 i 5.
Si introdueix un número més gran o més petit, torna-li a demanar l'enter.
Imprimeix per pantalla: El número introduït: 3, substituint el 3 pel número.
input: 10 7 3
output: El número introduït: 3*/