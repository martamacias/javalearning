package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class NiceIsLegalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quina és la teva edat?");
        int edatUsuari = scanner.nextInt();
        if (edatUsuari >= 18){
            System.out.println("Ets major d'edat");
        }else{
            System.exit(0);
        }
    }
}
