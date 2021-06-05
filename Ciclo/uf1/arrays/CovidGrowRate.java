package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class CovidGrowRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = scannerRead(scanner);

        for (int i=1; i< array.length; i++){
            for (int j=i-1; i>j; j++) {
                double infeccio = array[i] / array[j];
                System.out.print(infeccio+"  ");
            }
        }
    }
    public static double[] scannerRead(Scanner scanner) {
        int quant = scanner.nextInt();
        double[] array = new double[quant];
        for (int i = 0; i < quant; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
