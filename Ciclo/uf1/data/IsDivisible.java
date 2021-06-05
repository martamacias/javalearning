package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();

        boolean isDivisible = firstInteger%secondInteger == 0;

        System.out.println(isDivisible);
    }
}
