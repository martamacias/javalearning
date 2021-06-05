package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;
import java.lang.Math;

public class HiddenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // L'ordinador pensa un número de 1 a 3
        int random = (int) (Math.random() * 2) +1;
        // Usuari introdueix un enter
        int value = scanner.nextInt();
        //imprimir acertat o no
        boolean valueOk = (random==value);

        if (valueOk){
            System.out.println("L'has encertat");
        }else{
            System.out.println("No l'has encertat");
        }
    }
}
