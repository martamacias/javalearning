package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BicicleDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double veloc = scanner.nextDouble();
        double[] metres = new double[10];
        metres[0] = veloc;

        for (int x=1; x< metres.length; x++){
            metres[x] = veloc+metres[x-1];
        }
        System.out.println(Arrays.toString(metres));
    }
}
/*Donada una velocitat d'una bicicleta en metres per segon, indica els metre que haurà
recorregut quan hagi passat 1,2,3,4,5,6,7,8,9 i 10 segons.

input: 2.5
output: 2.5 5.0 7.5 10.0 12.5 15.0 17.5 20.0 22.5 25.0*/