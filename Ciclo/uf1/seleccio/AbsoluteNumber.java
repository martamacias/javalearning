package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value>0){
            System.out.println(value);
        }else{
            System.out.println(-value);
        }

    }
}
