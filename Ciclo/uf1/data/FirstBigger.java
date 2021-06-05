package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class FirstBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        boolean firstBigger = first > second;

        System.out.println(firstBigger);
    }
}
