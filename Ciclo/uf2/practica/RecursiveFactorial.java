package cat.itb.martamacias7e4.dam.m03.uf2.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> factorials = listFactorials(scanner);
        readFactorials(factorials);
    }

    /**
     * create an integer list of factorials
     * @param scanner
     * @return the list
     */
    private static List<Integer> listFactorials(Scanner scanner) {
        int quant = scanner.nextInt();
        int factorial = 0;
        List<Integer> factorials = new ArrayList<>();
        for (int i = 0; i < quant; i++) {
            factorial = readFactorial(scanner);
            factorials.add(factorial);
        }
        return factorials;
    }

    /**
     * read the factorial with scanner
     * @param scanner
     * @return the scanner
     */
    private static int readFactorial(Scanner scanner) {
        return scanner.nextInt();
    }

    /**
     * reads the list of factorials
     * @param factorials
     */
    private static void readFactorials(List <Integer> factorials) {
        for (int factorial: factorials){
            factorial = calculateFactorial(factorial);
            printFactorials(factorial);
        }
    }

    /**
     * calculates the factorial of a number in the list
     * @param factorial
     * @return
     */
    private static int calculateFactorial(int factorial) {
        if (factorial == 0){
            return 1;
        }
        return factorial * calculateFactorial(factorial-1);
    }

    /**
     * prints the result
     * @param factorial
     */
    private static void printFactorials(int factorial) {
        System.out.println(factorial);
    }

}
/*
Fes un programa que calculi el factorial d'un nombre usant una funció recursiva.
L'usuari primer introdurià el nombre de factorials a realitzar. Un cop introduïts tots els enters, imprimeix tots els factorials.

Input
2
5
0

Output
120
1
 */