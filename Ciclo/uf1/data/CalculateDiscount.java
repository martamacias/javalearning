package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        // Prepare to read values from input.
        Scanner scanner = new Scanner(System.in);
        // Reads an double
        double originalPrice = scanner.nextDouble();
        double actualPrice = scanner.nextDouble();
        System.out.println((actualPrice*100/originalPrice)+"%");

    }
}
