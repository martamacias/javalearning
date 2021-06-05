package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    /**
     * Reads the numbers and form a list
     * @param scanner the numbers
     * @return a list of integers
     */
    public static List<Integer> readArray(Scanner scanner){
        List<Integer> list = new ArrayList<>();
        int value = scanner.nextInt();
        while (value!=-1){
            list.add(value);
            value = scanner.nextInt();
        }
        return list;
    }

    /**
     * Calculates the sum of integers
     * @param list of integers
     * @return the total sum
     */
    public static int sumArray(List<Integer> list) {
        int total = 0;
        for (int number: list) {
            total += number;
        }
        return total;
    }

    /**
     * read a list of integers and return the min value
     * @param list
     * @return min value
     */
    public static int min(List<Integer> list){
        int minValue = list.get(0);
        for (Integer integer : list) {
            if (minValue > integer) {
                minValue = integer;
            }
        }
        return minValue;
    }

    /**
     * calculates the max value from a list of integers
     * @param list
     * @return the min value
     */
    public static int max(List<Integer> list){
        int maxValue = list.get(0);
        for (Integer integer : list) {
            if (maxValue < integer) {
                maxValue = integer;
            }
        }
        return maxValue;
    }

    /**
     * print total de sumArray
     * @param list
     */
    public static void print(List<Integer> list) {
        int total = sumArray(list);
        System.out.println(total);
    }
}
