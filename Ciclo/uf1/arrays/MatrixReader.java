package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = matrixReader(scanner);
        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] matrixReader(Scanner scanner) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j=0; j<y; j++)
                array[i][j] = scanner.nextInt();
        }
        return array;
    }

}
