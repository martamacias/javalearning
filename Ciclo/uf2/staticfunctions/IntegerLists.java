package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
    public static List<Integer> readIntegerList(Scanner scanner){
        List<Integer> values = new ArrayList<>();
        int value = scanner.nextInt();
        while (value!=-1){
            values.add(value);
            value = scanner.nextInt();
        }
        return values;
    }
    public static int min(List<Integer> lista){
        int minValue = lista.get(0);
        for (int i=0; i< lista.size(); i++){
            if (minValue> lista.get(i)){
                minValue = lista.get(i);
            }
        }
        return minValue;
    }
    public static int max(List<Integer> lista){
        int maxValue = lista.get(0);
        for (int i=0; i< lista.size(); i++){
            if (maxValue< lista.get(i)){
                maxValue = lista.get(i);
            }
        }
        return maxValue;
    }
    public static double avg(List<Integer> lista){
        int suma = 0;
        for (int value: lista) {
            suma += value;
        }
        return (double) suma / lista.size();
    }
}
