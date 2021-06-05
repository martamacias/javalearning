package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class WillWeFightForThecookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantes persones hi ha?");
        int persons = scanner.nextInt();
        System.out.println("Quantes galetes teniu?");
        int cookies = scanner.nextInt();

        if (cookies%persons==0){
            System.out.println("Let's eat!");
        }else{
            System.out.println("Let's fight!");
        }
    }
}
