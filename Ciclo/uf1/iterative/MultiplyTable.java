package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        //L'usuari introdueix un enter
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        //Printa per pantalla la taula de multiplicar del número introduit:
        int i = 1;
        while (i <= 9){
            int result = value * i;
            System.out.println(i+" * "+value+" = "+result);
            i++;
        }
    }
}
