package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IvaPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = scannerRead(scanner);

        for (int i=0; i< array.length; i++){
            double total =+ array[i] + (21*array[i]/100);
            System.out.println(array[i]+" IVA = "+total);
        }

    }
    public static double[] scannerRead(Scanner scanner) {
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
/*En una botiga volem convertir tot de preus sense a IVA al preu amb IVA.
Per afegir l'IVA a un preu hem de sumar-hi el 21% del seu valor.*/