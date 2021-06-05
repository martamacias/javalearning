package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.List;
import java.util.Scanner;

public class MostDistantAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ages = ArrayFunctions.readArray(scanner);
        int difference = ArrayFunctions.max(ages) - ArrayFunctions.min(ages);
        System.out.println(difference);
    }
}
/*
Volem fer un programa que donada les edats de totes les persones d'un concert ens digui la diferència entre la persona
més gran i la més jove. Per fer-ho l'usuari introduirà les edats de les persones. Quan ja hagi acabat introduirà -1

Input
15 54 23 48 57 23 48 10 48 79 85 34 78 -1
Output
75
 */