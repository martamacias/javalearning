package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
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
            System.out.println(lista2);
        }else {
            System.out.println(lista1);
        }
    }
}
