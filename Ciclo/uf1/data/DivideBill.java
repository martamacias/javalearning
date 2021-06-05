package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class DivideBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int dinnerCost = scanner.nextInt();

        int splitCost = dinnerCost/people;

        System.out.println(splitCost);
    }
}
