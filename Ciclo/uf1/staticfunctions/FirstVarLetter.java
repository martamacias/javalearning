package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;

public class FirstVarLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //L'usuari escriu la primer caràcter de l'identificador d'una variable.
        char value = scanner.nextLine().toCharArray()[0];
        //Indica si és un caràcter vàlid, segons les convensions de Java. Imprimeix una opció correcte si pots
        boolean isLowerCase = Character.isLowerCase(value);
        boolean isLetter = Character.isLetter(value);

        if (isLowerCase && isLetter) {
            System.out.println("Caràcter correcte");
        }else if (!isLowerCase && isLetter){
            char toLowerCase = Character.toLowerCase(value);
            System.out.println("Caràcter incorrecte");
            System.out.println(toLowerCase);
        }else {
            System.out.println("Caràcter incorrecte");
        }
    }
}
