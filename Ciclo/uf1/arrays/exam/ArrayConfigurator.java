package cat.itb.martamacias7e4.dam.m03.uf1.arrays.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConfigurator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        int[] array = new int[10];

        while (position != -1){
            int num = scanner.nextInt();
            array[position] = num;
            position = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

    }
}
