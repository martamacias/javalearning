package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.List;
import java.util.Scanner;

public class PeopleCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = ArrayFunctions.readArray(scanner);
        ArrayFunctions.print(list);
    }
}
/*
Volem fer un programa que ens digui la quantitat de gent que hi ha en un edifici.
Quan ja hagi visitat totes les sales introduirà -1

Input
5 3 4 7 8 -1

Output
27
 */