package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class MinOf10Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[10];

        for (int j=0; j<10; j++){
            int value = scanner.nextInt();
            values[j] = value;
        }

        int minValue = values[0];
        for (int i=0; i<10; i++){
            if (minValue>values[i]){
                minValue = values[i];
            }
        }
        System.out.println(minValue);

    }
}
//L'usuari entra 10 enters. Crea un array amb aquest valors.
//Imprimeix per pantalla el valor més petit introduit.