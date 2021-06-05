package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class HowBigIsMyPizza {
    public static void main(String[] args) {
        // Prepare to read values from input.
        Scanner scanner = new Scanner(System.in);
        // Reads an double
        double pizzaDiameter = scanner.nextDouble();
        System.out.println((pizzaDiameter/2)*(pizzaDiameter/2)*3.1416);
    }
}
