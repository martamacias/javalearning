package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CapICuaValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = scannerRead(scanner);
        int[] reves = new int[array.length];

        int j = 0;
        for (int i = array.length-1; i>=0; i--) {
            int value = array[i];
            reves[j] = value;
            j++;
        }

        String number1 = Arrays.toString(array);
        String number2 = Arrays.toString(reves);
        //System.out.println(number1);
        //System.out.println(number2);

        boolean capCua = (number1.equals(number2));
        if (capCua){
            System.out.println("És cap i cua");
        }else {
            System.out.println("No és cap i cua");
        }
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
/*Printa per pantalla cap i cua si la llista de N
valors introduits per l'usuari són cap i cua (llegits en ordre invers és la mateixa llista).*/
