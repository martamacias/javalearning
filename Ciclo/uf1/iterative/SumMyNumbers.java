package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class SumMyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = 0;

        while(numero > 0) {
            resultado += numero % 10;
            numero = numero / 10;
        }
        System.out.println("La suma es: " + resultado);
    }
}
//Fer un programa que llegeixi un nombre enter positiu n i escrigui la suma de les seves xifres.
// Per exemple les xifres del nombre 456 sumen (4+5+6) = 15