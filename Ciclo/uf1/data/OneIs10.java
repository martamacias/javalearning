package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class OneIs10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu 4 números");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        boolean num1is10 = number1 == 10;
        boolean num2is10 = number2 == 10;
        boolean num3is10 = number3 == 10;
        boolean num4is10 = number4 == 10;

        boolean oneIs10 = num1is10 || num2is10 || num3is10 || num4is10;

        System.out.println(oneIs10);
    }
}
