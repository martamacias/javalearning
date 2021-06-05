package cat.itb.martamacias7e4.dam.m03.uf1.seleccio.exam;

import java.util.Scanner;

public class LaMasovera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();

        String compra;
        switch (dia){
            case "dilluns":
                compra = "Compra llums";
                break;
            case "dimarts":
                compra = "Compra naps";
                break;
            case "dimecres":
                compra = "Compra nespres";
                break;
            case "dijous":
                compra = "Compra nous";
                break;
            case "divendres":
                compra = "Faves tendres";
                break;
            case "dissabte":
                compra = "Tot s'ho gasta";
                break;
            case "diumenge":
                compra = "Tot s'ho menja";
                break;
            default:
                compra = "Dia no vàlid";
                break;
        }
        System.out.println(compra);
    }
}