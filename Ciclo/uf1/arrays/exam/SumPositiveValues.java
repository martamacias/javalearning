package cat.itb.martamacias7e4.dam.m03.uf1.arrays.exam;

import java.util.Scanner;

public class SumPositiveValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = arrayReader(scanner);

        int suma = 0;
        for (int value : array){
            if (value>0){
                suma += value;
            }
        }
        System.out.println(suma);
    }
    public static int[] arrayReader(Scanner scanner) {
        int quant = scanner.nextInt();
        int[] array = new int[quant];
        for (int i = 0; i < quant; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
