package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;
import java.lang.Math;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu dos enters");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double pow = Math.pow(a,b);
        System.out.println(pow);
    }
}
