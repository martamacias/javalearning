package cat.itb.martamacias7e4.dam.m03.uf2.generalexam;

import cat.itb.martamacias7e4.dam.m03.uf1.arrays.ArrayReader;
import java.util.Scanner;

public class AirContamination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = ArrayReader.scannerReadIntArray(scanner);
        double avg = avgContamination(values);
        printAvg(avg);
        int total = compareCont(values, avg);
        printTotal(total);
    }
    private static double avgContamination(int[] values) {
        int suma = 0;
        for (int value: values) {
            suma += value;
        }
        return (double) suma / values.length;
    }
    private static int compareCont(int[] values, double avg) {
        int total = 0;
        for (int value: values) {
            if (value>avg){
                total +=1;
            }
        }
        return total;
    }
    private static void printAvg(double avg) {
        System.out.printf("Contaminació mitjana : %.2f%n", avg);
    }
    private static void printTotal(int total) {
        System.out.printf("Dies amb amb contaminació superior: %d%n", total);
    }
}