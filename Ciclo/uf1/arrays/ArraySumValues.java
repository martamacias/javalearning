package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class ArraySumValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = scannerRead(scanner);

        int suma = 0;
        for (int value : array){
            suma += value;
        }
        System.out.println(suma);

    }
    public static int[] scannerRead(Scanner scanner) {
        int quant = scanner.nextInt();
        int[] array = new int[quant];
        for (int i = 0; i < quant; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
/*L'usuari introduix una llista de valors tal i com s'indica al mètode ArrayReader.
Imprimeix per pantalla la suma d'aquests valors.*/