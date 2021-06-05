package cat.itb.martamacias7e4.dam.m03.uf1.seleccio.exam;

import java.util.Scanner;

public class CowType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix: Edat de l'animal, el sexe (1 = mascle, 2 = femella) i si està capat (1 = no capat, 2 = capat).");
        int edat = scanner.nextInt();
        int sexe = scanner.nextInt();
        int capat = scanner.nextInt();

        if (edat < 2){
            System.out.println("Vedell");
        }if (edat >= 2){
            if (sexe == 1){
                if (capat == 1){
                    System.out.println("Toro");
                }else if (capat == 2){
                    System.out.println("Bou");
                }
            }else if (sexe == 2){
                System.out.println("Vaca");
            }
        }
    }
}