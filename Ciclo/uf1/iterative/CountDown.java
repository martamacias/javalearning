package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //L'usuari introdueix un enter (N) i es mostra per pantalla un compte enrere de N fins a 1.
        int n = scanner.nextInt();

        int x;
        for (x=n;x>=1;x--){
            System.out.print(x);
        }
    }
}
