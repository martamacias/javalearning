package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {{2,5,1,6},{23,52,14,36},{23,75,81,64}};

        int suma =0;
        for (int i=0; i<3; i++){
            for (int x=0; x<4; x++){
                suma += matrix[i][x];
            }
        }
        System.out.println(suma);
    }
}
