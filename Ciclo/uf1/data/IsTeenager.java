package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IsTeenager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        boolean is10Teenager = age >10;
        boolean is20Teenager = age <20;

        boolean isTeenager = is10Teenager && is20Teenager;

        System.out.println(isTeenager);
    }
}
