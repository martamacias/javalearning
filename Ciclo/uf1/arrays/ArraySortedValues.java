package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortedValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quant = scanner.nextInt();
        int[] listValues = new int[quant];
        int aux;

        for (int i=0; i<quant; i++){
            listValues[i]= scanner.nextInt();
        }
        String lista1 = Arrays.toString(listValues);
        for(int i = 0; i < quant; i++) {
            for (int j = i + 1; j < quant; j++) {
                if (listValues[i] > listValues[j]) {
                    aux = listValues[j];
                    listValues[j] = listValues[i];
                    listValues[i] = aux;
                }
            }
        }
        String lista2 = Arrays.toString(listValues);

        if (!lista1.equals(lista2)) {
            System.out.println("No ordenats.");
            System.out.println("La llista ordenada sería:");
            System.out.println(lista2);
        }else {
            System.out.println("ordenats");
        }
    }
}
/*Printa per pantalla ordenats si la llista de N valors introduits per l'usuari estan ordenats.

L'usuari primer entrarà el número d'enters a introudir i després els diferents enters.*/