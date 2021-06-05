package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitForInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int value = scanner.nextInt();
            System.out.println("Número: " + value);
        } catch (InputMismatchException inputException) {
            System.out.println("No és un enter");
        }
    }
}

/*
Fes un programa que llegeixi l'entrada de l'usuari. Si l'usuari no introdueixi un enter printa No és un enter. Si l'usuari introdueixi un enter printa'l amb el missatge Número: X
 */