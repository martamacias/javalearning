package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.List;
import java.util.Scanner;

public class MethodReferenceSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = IntegerLists.readIntegerList(scanner);

        values.removeIf(MethodReferenceSample::endsWithThree);
        values.sort(MethodReferenceSample::sortListDesc);
        values.forEach(System.out::println);
    }

    private static int sortListDesc(Integer integer, Integer integer1) {
        return (integer1 - integer);
    }

    private static boolean endsWithThree(Integer integer) {
        return integer%10==3;
    }
}
//43 65 2 75 1 54 73 23 33 65 25 73 425432 65 34 2 -1