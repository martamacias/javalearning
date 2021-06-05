package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixBoxesOpenedCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int[][] recompte = new int[4][4];

        while (x != -1){
            int y = scanner.nextInt();
            recompte[x][y]++;
            x = scanner.nextInt();
        }

        System.out.println(Arrays.deepToString(recompte));
    }
}
/*Un banc té tot de caixes de seguretat en una graella, enumerades per fila i columna del 0 al 3.
Volem registar quan els usuaris obren una caixa de seguretat, i al final del dia, fer-ne un recompte.

L'usuari introduirà parells d'entrers del 0 al 3 quan s'obri la caixa indicada.
Quan introduiexi l'enter -1, és que s'ha acabat el dia. Printa per pantalla el nombre de cops que s'ha obert.
input: 1 1 1 3 3 3 1 1 3 3 3 0 0 3 -1
output: [[0, 0, 0, 1], [0, 2, 0, 1], [0, 0, 0, 0], [1, 0, 0, 2]]*/