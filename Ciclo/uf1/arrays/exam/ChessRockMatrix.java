package cat.itb.martamacias7e4.dam.m03.uf1.arrays.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ChessRockMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] tauler = new boolean[8][8];
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i < tauler.length; i++) {
            if (i != x) {
                tauler[i][y] = true;
            }else {
                for (int j = 0; j < tauler.length; j++) {
                    tauler[i][j] = true;
                }
                tauler[x][y] = false;
            }
        }
        System.out.println(Arrays.deepToString(tauler));
    }
}
