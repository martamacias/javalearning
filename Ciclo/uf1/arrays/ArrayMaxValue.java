package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class ArrayMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = scannerRead(scanner);

        int maxValue = array[0];
        for (int i=0; i<array.length; i++){
            if (maxValue<array[i]){
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

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
