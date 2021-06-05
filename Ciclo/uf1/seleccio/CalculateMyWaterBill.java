package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class CalculateMyWaterBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix la lletra del tipus d'habitatge i número de m^3 d'aigua gastats.");
        String lletra = scanner.next();
        double m3 = scanner.nextDouble();

        double tarifa = 0;
        switch (lletra){
            case "A":
                tarifa = 2.46+(m3*0.25);
                break;
            case "B":
                tarifa = 6.40+(m3*0.33);
                break;
            case "C":
                tarifa = 7.25+(m3*0.40);
                break;
            case "D":
                tarifa = 11.21+(m3*0.50);
                break;
            case "E":
                tarifa = 12.10+(m3*0.63);
                break;
            case "F":
                tarifa = 17.28+(m3*1.00);
                break;
            case "G":
                tarifa = 28.01+(m3*1.60);
                break;
            case "H":
                tarifa = 40.50+(m3*2.50);
                break;
            case "I":
                tarifa = 61.31+(m3*4.00);
                break;
        }
        System.out.println(tarifa + "€");
    }
}
