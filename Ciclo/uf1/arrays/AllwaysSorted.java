package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.*;

public class AllwaysSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int number = scanner.nextInt();
        while (number != -1){
            list.add(number);
            number = scanner.nextInt();
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
