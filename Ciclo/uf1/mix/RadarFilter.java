package cat.itb.martamacias7e4.dam.m03.uf1.mix;

import java.util.Scanner;

public class RadarFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int veloc = scanner.nextInt();
        int quant = 0;
        while (veloc!=-1){
            if (veloc>90){
                quant++;
            }
            veloc = scanner.nextInt();
        }
        System.out.println(quant);
    }
}
