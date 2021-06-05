package cat.itb.martamacias7e4.dam.m03.uf1.seleccio.exam;

import java.util.Scanner;

public class ThreeCardPoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        if (carta1 == carta2 && carta2 == carta3) {
            System.out.println("Trio");
        }else if (carta1 == carta2 || carta1 == carta3 || carta2 == carta3) {
            System.out.println("Parella");
        }else if (carta2 == carta1+1 && carta3 == carta2+1){
            System.out.println("Escala");
        }else{
            System.out.println("Número alt");
        }
    }
}