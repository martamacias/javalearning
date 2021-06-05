package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};
        int value = scanner.nextInt();
        System.out.println(daysOfWeek[value]);
    }
}
//Donat un enter, printa el dia de la setmana amb text (dilluns, dimarts, dimecres),
//tenint en compte que dilluns és el 0.