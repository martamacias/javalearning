package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GoTournamentGreatestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        List<Double> points = new ArrayList<Double>();
        String nom = scanner.nextLine();
        names.add(nom);


        int i = 0;
        while (! nom.equals("END")){
            double punt = scanner2.nextDouble();
            points.add(punt);
            nom = scanner.nextLine();
            names.add(nom);
            i++;
        }

        double max = Collections.max(points);
        int best = points.indexOf(max);
        String win = names.get(best);

        System.out.println(win+": "+max);
    }
}
//Ens han demanat que fem un programa per un torneig de Go. Necessitem fer un programa que donada una llista de puntuacions,
// ens digui qui és el guanyador del torneig.
//L'usuari introduirà el nom del participant i la puntuació, cada un en una línia.
//Quan ja no hi hagi més participants entrara la paraula clau END.
//Imprimeix per pantalla el guanyador del concurs i els punts obtinguts.