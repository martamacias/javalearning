package cat.itb.martamacias7e4.dam.m03.uf1.strings.practice;

import java.util.Scanner;

public class SuperSecretText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sino = scanner.nextInt();
        int num = scanner.nextInt();
        String space = scanner.nextLine();
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (sino==0){
                int asci = text.codePointAt(i);
                char lletra = (char)(asci-num);
                System.out.print(lletra);
            }else if (sino==1){
                int asci = text.codePointAt(i);
                char lletra = (char)(asci+num);
                System.out.print(lletra);
            }else {
                System.out.println("error");
            }
        }

    }
}
/*Volem fer un petit sistema per a encirptar missatges de text. Donat un enter,
sumarem l'enter a cada caràcter per xifrar el missatge i el restarem per dexifrar-lo.

L'usuari introduirà 1 si vol xifrar, 0 si vol dexifrar
L'usuari introduirà l'enter per xifrar
L'usuari introduirà una línia de text
Imprimeix per pantalla el text resultant.*/