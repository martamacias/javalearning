package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IsLegalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        boolean isLegalAge= age >= 18;

        System.out.println(isLegalAge);
    }
}
