package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.List;
import java.util.Scanner;

public class LamdaSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = IntegerLists.readIntegerList(scanner);
        values.removeIf(value -> value%10==3);
        values.sort((v1, v2) -> (v2-v1));
        values.forEach(value -> System.out.println(value));
        // OPCION 2:
        //values.forEach(System.out::println);
    }
}
/*
Usant lambdes, llegeix una llista d'enters usant IntegerLists.readIntegerList.
Donats els enters, elimina els que acaben amb 3, ordena'ls de major a menor, i imprimieix-los per pantalla.

Input
43 65 2 75 1 54 73 23 33 65 25 73 425432 65 34 2 -1

Output
425432
75
65
65
65
54
34
25
2
2
1
 */