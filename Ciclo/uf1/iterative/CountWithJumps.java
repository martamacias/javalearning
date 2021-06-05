package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class CountWithJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //L'usuari introdueix dos valors enters, el final i el salt
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        //Escriu tots els numeros des de l'1 fins al final, amb una distància de salt

        int i;
        for (i=1;i<=n;i+=x){
            System.out.print(i+" ");
        }
    }
}
