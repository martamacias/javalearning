package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class HelloToMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.next();

        String text = "Bon dia " + nom;

        System.out.println(text);
    }
}
