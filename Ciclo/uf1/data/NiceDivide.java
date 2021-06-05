package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class NiceDivide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu 2 números enters");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int divide = number1/number2;
        int module = number1%number2;

        System.out.println(number1+" dividit entre "+number2+" és "+divide+" mòdul "+module);
    }
}
