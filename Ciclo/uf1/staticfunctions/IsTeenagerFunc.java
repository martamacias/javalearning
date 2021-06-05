package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;

public class IsTeenagerFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        /*boolean is10Teenager = age >10;
        boolean is20Teenager = age <20;
        is10Teenager && is20Teenager*/
        
        System.out.println(funcTeenager(age));
    }

    private static boolean funcTeenager(int age) {
        boolean is10Teenager = age >10;
        boolean is20Teenager = age <20;
        return is10Teenager && is20Teenager;
    }

}
