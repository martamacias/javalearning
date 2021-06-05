package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.*;

public class StoreFirstOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();
        int value = sc.nextInt();
        while (value != -1) {
            values.add(value);
            value = sc.nextInt();
        }
        Set<Integer> set = new LinkedHashSet<>(values);
        values.clear();
        values.addAll(set);
        System.out.println(values);
    }
}
/*L'usuari introduirà enters. Enmagatzema en una llista la primera vegada que l'usuari entri un valor.
Quan introdueixi un -1 és que ja ha acabat.

input: 1 3 9 3 5 1 9 2 -1
output: [1, 3, 9, 5, 2]*/