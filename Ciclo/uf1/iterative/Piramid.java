package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();

        for (int i = 0;i<=altura;i++){
            int piramid = 0;
            while (piramid < i){
                System.out.print("# ");
                piramid ++;
            }
            System.out.println();
        }
    }
}
