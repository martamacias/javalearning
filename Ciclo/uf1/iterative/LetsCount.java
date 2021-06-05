package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class LetsCount {
    public static void main(String[] args) {
        //Printa per pantalla tots els números fins a un enter entrat per l'usuari
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int cont = 1;
        while (cont <= userNum){
            System.out.print(cont);
            cont++;
        }
    }
}
