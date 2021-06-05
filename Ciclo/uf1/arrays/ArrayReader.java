package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(Arrays.toString(scannerReadIntArray(scanner)));
    }

    public static int[] scannerReadIntArray(Scanner scanner) {
        int quant = scanner.nextInt();
        int[] array = new int[quant];
        for (int i = 0; i < quant; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
