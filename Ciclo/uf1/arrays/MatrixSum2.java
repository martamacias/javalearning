package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = matrixReader(scanner);
        int[][] matrix2 = matrixReader(scanner);
        int[][] sumatori = new int[matrix1.length][matrix1.length];
        for (int i=0; i< matrix1.length; i++){
            for (int j=0; j< matrix1.length; j++){
                sumatori[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sumatori));
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
