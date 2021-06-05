package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu un any.");
        int any = scanner.nextInt();

        if ((any % 4 == 0 && any % 100 != 0) || (any % 100 == 0 && any % 400 == 0)) {
            System.out.println(any + " és any de traspàs.");
        } else {
            System.out.println(any + " no és any de traspàs");
        }
    }
}
