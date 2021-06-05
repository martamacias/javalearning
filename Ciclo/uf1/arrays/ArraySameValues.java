package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySameValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = scannerRead(scanner);
        String list1 = Arrays.toString(array);
        array = scannerRead(scanner);
        String list2 = Arrays.toString(array);
        //System.out.println(list1);
        //System.out.println(list2);

        boolean same = list1.equals(list2);
        if (same){
            System.out.println("són iguals");
        }else {
            System.out.println("no són iguals");
        }
    }
    public static int[] scannerRead(Scanner scanner) {
        System.out.println("Escriu la teva llista:");
        int quant = scanner.nextInt();
        int[] array = new int[quant];
        for (int i = 0; i < quant; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
/*L'usuari introduirà 2 llistes de valors, com s'indica al mètode ArrayReader.
Printa per pantalla són iguals si ha introduit la mateixa llista, o no són iguals si són diferents*/