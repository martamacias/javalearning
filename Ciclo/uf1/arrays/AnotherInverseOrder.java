package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnotherInverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int value = scanner.nextInt();
        while (value != -1){
            list.add(value);
            value = scanner.nextInt();
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
/*L'usuari entrarà un conjunt d'enters per pantalla. Quan introdueixi el -1, és que ja ha acabat.
Imprimeix-los en l'odre invers al que els ha entrat.

input: 1 2 3 4 8 2 -1
output: [2, 8, 4, 3, 2, 1]*/