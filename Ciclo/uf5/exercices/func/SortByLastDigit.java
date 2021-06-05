package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLastDigit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(253,432,65,234,43,16,28,432,34,65,312,34,2134,76,2,76,23,67,27,8,54235256,4560,7431);
        list.sort(Comparator.comparing(value -> value%10));
        System.out.println(list);
    }
}
/*
Donada la següent llista d'enters

List<Integer> list = Arrays.asList(253,432,65,234,43,16,28,432,34,65,312,34,2134,76,2,76,23,67,27,8,54235256,4560,7431);
Imprimeix-la ordenada per l'ultim digit de cada número.

[4560, 7431, 432, 432, 312, 2, 253, 43, 23, 234, 34, 34, 2134, 65, 65, 16, 76, 76, 54235256, 67, 27, 28, 8]

 */