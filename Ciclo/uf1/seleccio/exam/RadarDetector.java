package cat.itb.martamacias7e4.dam.m03.uf1.seleccio.exam;

import java.util.Scanner;

public class RadarDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int veloc = scanner.nextInt();

        if (veloc <= 120){
            System.out.println("Correcte");
        }else if (veloc < 140){
            System.out.println("Multa lleu");
        }else{
            System.out.println("Multa greu");
        }
    }
}
