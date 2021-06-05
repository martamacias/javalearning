package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IntSum {
    public static void main(String[] args) {
        // ask a user 2 integer
        Scanner scanner = new Scanner(System.in);
        int userInputValue1 = scanner.nextInt();
        int userInputValue2 = scanner.nextInt();
        //
        System.out.println(userInputValue1+userInputValue2);
    }
}
