package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;
//import java.lang.Math;

public class RockPaperScissorsVsComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //usuari introdueix un enter 1, 2 o 3
        int numUser = scanner.nextInt();
        //ordinador decideix la seva tirada
        int numPC = (int) (Math.random() * 2) +1;
        //imprimeix la tirada de l'ordinador
        String tiradaPC = "";
        switch (numPC) {
            case 1:
                tiradaPC = "pedra";
                break;
            case 2:
                tiradaPC = "paper";
                break;
            case 3:
                tiradaPC = "tissores";
                break;
        }
        System.out.println("L'ordinador ha tirat " + tiradaPC);

        //imprimeix qui guanya
        if (numUser == 1) {
            if (numPC == 2) {
                System.out.println("Guanya l'ordinador");
            } else if (numPC == 3) {
                System.out.println("Has guanyat");
            } else {
                System.out.println("Empat");
            }
        }

        if (numUser == 2){
            if (numPC == 2) {
                System.out.println("Empat");
            }else if (numPC == 3) {
                System.out.println("Guanya l'ordinador");
            }else{
                System.out.println("Has guanyat");
            }
        }

        if (numUser == 3){
            if (numPC == 2) {
                System.out.println("Has guanyat");
            }else if (numPC == 3) {
                System.out.println("Empat");
            }else{
                System.out.println("Guanya l'ordinador");
            }
        }
    }
}
