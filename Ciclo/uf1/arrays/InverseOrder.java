package cat.itb.martamacias7e4.dam.m03.uf1.arrays;


import java.util.Scanner;

public class InverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[10];
        for (int i=0; i<10; i++){
            int value = scanner.nextInt();
            values[i] = value;
        }
        for (int j=1; j<11;j++){
            System.out.println(values[10-j]);
        }
    }
}
