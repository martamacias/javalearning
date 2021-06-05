package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean isOdd = value%2==0;
        System.out.println(isOdd);
    }
}
