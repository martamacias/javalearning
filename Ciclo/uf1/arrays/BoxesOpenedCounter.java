package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BoxesOpenedCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int open = scanner.nextInt();
        int[] recompte = new int[10];

        while (open != -1){
            recompte[open]++;
            open = scanner.nextInt();
        }
        System.out.println(Arrays.toString(recompte));
    }
}
/*Un banc té tot de caixes de seguretat, enumerades del 0 al 10.
Volem registar quan els usuaris obren una caixa de seguretat, i al final del dia, fer-ne un recompte.

L'usuari introduirà enters del 0 al 10 quan s'obri la caixa indicada.
Quan introduiexi l'enter -1, és que s'ha acabat el dia. Printa per pantalla el nombre de cops que s'ha obert.
input: 5 4 9 0 0 5 5 5 3 5 -1
output: [2, 0, 0, 1, 1, 5, 0, 0, 0, 1]*/