package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class WhichBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu dos valors enters");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        if (value1>value2){
            System.out.println(value1);
        }else {
            System.out.println(value2);
        }
    }
}
