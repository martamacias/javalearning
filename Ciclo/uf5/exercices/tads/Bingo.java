package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> targeta = getTargeta(scanner);
        //System.out.println(targeta);
        compareBingo(scanner, targeta);
    }

    private static void compareBingo(Scanner scanner, Set<Integer> targeta) {
        int num = scanner.nextInt();
        while (!targeta.isEmpty()){
            targeta.remove(num);
            System.out.printf("Et queden %d números.%n", (targeta.size()));
            num = scanner.nextInt();
        }
        System.out.println("BINGO");
    }

    private static Set<Integer> getTargeta(Scanner scanner) {
        Set<Integer> targeta = new HashSet<>();
        for (int i=0; i<10; i++){
            int num = scanner.nextInt();
            targeta.add(num);
        }
        System.out.println("Targeta registrada");
        return targeta;
    }
}
/*
L'usuari primer itrodueix 10 números, que són els de la targeta.
Després introdueix els números que es van cantant.
Després que cada número cantat indica quants t'en queden.
Quan s'hagin cantat tots els números imprimeix BINGO i finialitza el programa
 */