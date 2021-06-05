package cat.itb.martamacias7e4.dam.m03.uf2.practica;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        int a = 1;
        int b = 1;
        boolean isFibonacci = isFibonacci(a,b,number);
        System.out.println(isFibonacci);
    }

    /**
     * scan the number
     * @param scanner
     * @return the number
     */
    private static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }

    /**
     * calcula els nombres de fibonacci i els compara amb el nombre donat.
     * @param a
     * @param b
     * @param number
     * @return true or false segons la coincidència
     */
    private static boolean isFibonacci(int a, int b, int number) {
        if (a > number) {
            return false;
        } else if (a == number) {
            return true;
        } else {
            return isFibonacci(a+b, a, number);
        }
    }
}
/*
Si es pren una successió de nombres naturals de tal forma que els dos primers termes siguin

F(0) = 0 F(1) = 1

i cadascun dels següents termes és la suma dels dos anteriors:

F(n) = F(n-2) + F(n-1)

Fes un programa que donat un número digui si és un número de la succeció de Fibonacci. Ha d'imrimir true si ho és, false sinó. Usa una funció recursiva per fer el càlcul.

Exemples
input: 377
output: true

input: 378
output: false
 */