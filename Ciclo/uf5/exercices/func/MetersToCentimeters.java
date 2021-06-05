package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.List;
import java.util.Scanner;

public class MetersToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> distances = IntegerLists.readIntegerList(scanner);
        distances.stream()
                .mapToInt(MetersToCentimeters::convertToCm)
                .forEach(System.out::println);
    }

    private static Integer convertToCm(Integer integer) {
        return integer*1000;
    }
}
/*
Llegeix una llista de distàncies per la consola (en format enter, usant IntegerLists.readIntegerList).
Converteix cada una de les distàncies a cm i imprimeix-les per pantalla.

Input
43 65 3246 54329 43 5423 54 -1

Output
43000
65000
3246000
54329000
43000
5423000
54000
 */