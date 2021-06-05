package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tria 1 número entre 1, 2 o 3");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        if (num1 == rock) {
            if (num2 == paper) {
                System.out.println("Guanya el segon.");
            } else if (num2 == scissors) {
                System.out.println("Guanya el primer");
            } else {
                System.out.println("Empat");
            }
        }

        if (num1 == paper){
            if (num2 == paper) {
                System.out.println("Empat");
            }else if (num2 == scissors) {
                System.out.println("Guanya el segon.");
            }else{
                System.out.println("Guanya el primer.");
            }
        }

        if (num1 == scissors){
            if (num2 == paper) {
                System.out.println("Guanya el primer.");
            }else if (num2 == scissors) {
                System.out.println("Empat");
            }else{
                System.out.println("Guanya el segon.");
            }
        }
    }
}
