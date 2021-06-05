package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Scanner;

public class SimpleBattleshipResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] flota = {{true, true, false, false, false, false, true}, {false, false, true, false, false, false, true},
                {false, false, false, false, false, false, true}, {false, true, true, true, false, false, true},
                {false, false, false, false, true, false, false}, {false, false, false, false, true, false, false},
                {true, false, false, false, false, false, false}};
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (flota[x][y]){
            System.out.println("tocat");
        }else {
            System.out.println("aigua");
        }
    }
}