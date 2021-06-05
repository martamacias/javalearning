package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class DoubleDoubleMe {
    public static void main(String[] args) {
        // Prepare to read values from input.
        Scanner scanner = new Scanner(System.in);
        // Reads a double
        double number = scanner.nextDouble();
        double result = number * 2.0;
        System.out.println(result);
    }
}
