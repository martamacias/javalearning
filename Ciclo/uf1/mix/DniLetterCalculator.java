package cat.itb.martamacias7e4.dam.m03.uf1.mix;

import java.util.Scanner;

public class DniLetterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] lletra = {'T','R','W','A','G','M', 'Y','F','P','D','X','B','N','J',
                'Z','S','Q','V','H','L','C','K','E'};
        int dni = scanner.nextInt();
        int let = lletra[dni%23];
        System.out.printf("%08d%c", dni, let);
    }
}
