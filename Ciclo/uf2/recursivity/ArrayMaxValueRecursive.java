package cat.itb.martamacias7e4.dam.m03.uf2.recursivity;


import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.List;
import java.util.Scanner;

public class ArrayMaxValueRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = IntegerLists.readIntegerList(scanner);
        int i =0;
        System.out.println(getMax(list, i));
    }
    public static int getMax(List<Integer> list, int i){
        if (i == list.size()-1){
            return list.get(i);
        }
        return Math.max(list.get(i), getMax(list, i+1));
    }
}
