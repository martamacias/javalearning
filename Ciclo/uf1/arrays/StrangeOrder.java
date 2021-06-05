package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StrangeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int value = scanner.nextInt();
        while (value != -1){
            lista.add(value);
            value = scanner.nextInt();
        }
        Collections.shuffle(lista);
        System.out.println(lista);
    }
}
