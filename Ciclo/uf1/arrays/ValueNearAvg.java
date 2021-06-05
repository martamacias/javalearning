package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class ValueNearAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = scannerRead(scanner);

        int suma = 0;
        for (int value : array){
            suma += value;
        }
        int mitjana = suma/ array.length;
        System.out.println(mitjana);


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
/*L'usuari introduix una llista de valors tal i com s'indica al mètode ArrayReader.
Imprimeix per pantalla el valor que està més proper a la mitjana dels valors de l'array
(calcula la mitjana dels valors primer i cerca el més proper després).

input: 4 1 3 9 20
output: 9*/