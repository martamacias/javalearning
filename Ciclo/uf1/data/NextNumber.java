package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class NextNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();

        String text = "Després ve el " + (number+1);

        System.out.println(text);
    }
}
