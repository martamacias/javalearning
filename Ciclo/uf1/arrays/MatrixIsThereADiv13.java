package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;

public class MatrixIsThereADiv13 {
    public static void main(String[] args) {
        int[][] matrix = {{2,5,1,6},{23,52,14,36},{23,75,81,62}};
        boolean[][] div = new boolean[3][4];

        for (int x=0; x<3; x++){
            for (int y=0; y<4; y++){
                if (matrix[x][y] % 13 == 0){
                    div[x][y] = true;
                }
            }
        }
        System.out.println(Arrays.deepToString(div));
    }
}
//Imprimeix true si algún dels números és divisible entre 13, false altrement.