package cat.itb.martamacias7e4.dam.m03.uf1.generalexam;

import java.util.Scanner;

public class BasketballTournamentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] equips = new int[9];
        int equip = scanner.nextInt();
        while (equip!=-1){
            equips[equip]++;
            System.out.printf("L'equip %d té %d victòries", equip, equips[equip]);
            equip = scanner.nextInt();
        }
    }
}