package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class HospitalQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Pacient> pacients = new PriorityQueue<>(Comparator.comparingInt(Pacient::getPrior).reversed());
        int option = scanner.nextInt();
        while (option!=-1) {
            if (option == 1) {
                Pacient pacient = getPacient(scanner);
                pacients.add(pacient);
            } else if (option == 0) {
                Pacient p = pacients.poll();
                assert p != null;
                String nom = p.nom;
                System.out.println(nom + " passi a consulta");
            }
            option = scanner.nextInt();
        }
    }
    private static Pacient getPacient(Scanner scanner) {
        int prior = scanner.nextInt();
        String name = scanner.nextLine();
        return new Pacient(prior, name);
    }
}
/*
Un hospital ens ha demanat que els hi fem un programa per a gestionar la cua d'accés a urgencies. Cada pacient tindrà un nom i una prioritat de tipus enter
(valor més alt indica més prioritat.

Si la línia comença amb un 1 és que ha entrat un pacient al hospital.
Si la línia comença amb un 0 és que s'atena un pacient.
Si la línia comença amb un -1 és que s'acaba el programa
Imprimeix per pantalla les crides dels diferents pacients

Input
1 25 Mar
1 60 Ot
0
1 10 Ona
0
-1

Output
Ot passi a consulta
Mar passi a consulta

 */