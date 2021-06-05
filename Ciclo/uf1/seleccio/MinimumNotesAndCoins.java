package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class MinimumNotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix una quantitat d'euros");
        double eur = scanner.nextDouble();

        int cant1 = (int) eur / 500;
        eur = eur % 500;
        if (cant1 >=1) {
            System.out.println(cant1 +" billete/s de 500€.");
        }
        int cant2 = (int) eur/200;
        eur = eur % 200;
        if (cant2>=1) {
            System.out.println(cant2 +" billete/s de 200€.");
        }
        int cant3 = (int) eur/100;
        eur = eur % 100;
        if (cant3>=1){
            System.out.println(cant3 +" billete/s de 100€.");
        }
        int cant4 = (int) eur/50;
        eur = eur % 50;
        if (cant4>=1){
            System.out.println(cant4 +" billete/s de 50€.");
        }
        int cant5 = (int) eur/20;
        eur = eur % 20;
        if (cant5>=1){
            System.out.println(cant5 +" billete/s de 20€.");
        }
        int cant6 = (int) eur/10;
        eur = eur % 10;
        if (cant6>=1){
            System.out.println(cant6 +" billete/s de 10€.");
        }
        int cant7 = (int) eur/5;
        eur = eur % 5;
        if (cant7>=1){
            System.out.println(cant7 +" billete/s de 5€.");
        }
        int cant8 = (int) eur/2;
        eur = eur % 2;
        if (cant8>=1){
            System.out.println(cant8 +" moneda/s de 2€.");
        }
        int cant9 = (int) eur;
        eur = eur % 1;
        if (cant9>=1){
            System.out.println(cant9 +" moneda/s de 1€.");
        }
        double cant10 = eur/0.5;
        eur = eur % 0.5;
        if (cant10>=1){
            System.out.println((int)cant10 +" moneda/s de 50 céntimos.");
        }
        double cant11 = eur/0.2;
        eur = eur % 0.2;
        if (cant11>=1){
            System.out.println((int)cant11 +" moneda/s de 20 céntimos.");
        }
        double cant12 = eur/0.1;
        eur = eur % 0.1;
        if (cant12>=1){
            System.out.println((int)cant12 +" moneda/s de 10 céntimos.");
        }
        double cant13 = eur/0.05;
        eur = eur % 0.05;
        if (cant13>=1){
            System.out.println((int)cant13 +" moneda/s de 5 céntimos.");
        }
        double cant14 = eur/0.02;
        eur = eur % 0.02;
        if (cant14>=1){
            System.out.println((int)cant14 +" moneda/s de 2 céntimos.");
        }
        double cant15 = eur/0.01;
        if (cant15>=1){
            System.out.println((int)cant15 +" moneda/s de 1 céntimos.");
        }
    }
}
