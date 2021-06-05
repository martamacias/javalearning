package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PushButtonPadlockSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] lock = new boolean[8];
        int userButtons = scanner.nextInt();

        while (userButtons != -1){
            lock[userButtons] = !lock[userButtons];
            userButtons = scanner.nextInt();
        }
        System.out.println(Arrays.toString(lock));
    }
}
/*La nostra versió, taḿbé tindrà 8 botons, però el primer serà el 0. Al inici tots els botons estaran sense apretar (0 - 7).

L'usuari introduirà enters indicant quin botó ha d'apretar (o desapretar)
Quan introdueixi el -1, és que ja ha acabat i hem d'imprimir l'estat del candau
input: 1 2 3 4 4 4 4 3 5 -1
output: [false, true, true, false, false, true, false, false]*/