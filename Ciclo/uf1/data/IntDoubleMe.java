package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IntDoubleMe {
    public static void main(String[] args) {
        // Ask a user integer
        Scanner scanner = new Scanner(System.in);
        int userInputValue = scanner.nextInt();
        // multiply number by 2
        // print result
        System.out.println(userInputValue*2);
    }
}
