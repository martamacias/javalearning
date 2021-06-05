package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void options(){
        System.out.println("Que vols fer?");
        System.out.println("1. Espero");
        System.out.println("2. Vaig a cercar menjar");
    }
    private static void die(){
        System.out.println("Has mort de gana.");
    }
    private static void palmera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi ha una palmera amb cocos");
        System.out.println("Que vols fer?");
        System.out.println("1. No hi pujo, és perllós.");
        System.out.println("2. Hi pujo.");
        int option3 = scanner.nextInt();
        if (option3 == 1) {
            die();
        } else {
            System.out.println("Desde dalt de la palmera veus un vaixell. Estàs salvat!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Et despertes a una illa de nit. L'últim que recordes és ofegar-te.");
        options();
        int option = scanner.nextInt();
        if (option == 2){
            System.out.println("És de nit, no veus res. T'esperes igualment.");
        }
        System.out.println("S'ha fet de dia. Tens molta gana.");
        options();
        int option2 = scanner.nextInt();
        if (option2 == 1){
            die();
        }else{
            palmera();
            }
        }

    }
