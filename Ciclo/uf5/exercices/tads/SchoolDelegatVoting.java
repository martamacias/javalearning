package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolDelegatVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> votes = getVotes(scanner);
        printMapVotes(votes);
    }

    private static void printMapVotes(Map<String, Integer> votes) {
        //OPCION 1
        votes.forEach((nom, vote) -> System.out.printf("%s: %d%n", nom, vote));

        //OPCION 2
        /*for (Map.Entry<String, Integer> entry : votes.entrySet()){
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }*/

        //OPCION 3
        /*for (String key: votes.keySet()){
            System.out.println(key+ ": " + votes.get(key));
        }*/
    }

    private static Map<String, Integer> getVotes(Scanner scanner) {
        Map<String, Integer> votes = new HashMap<>();
        String name = scanner.nextLine();
        while (!name.equals("END")){
            sumVotes(name, votes);
            name = scanner.nextLine();
        }
        return votes;
    }

    private static void sumVotes(String name, Map<String, Integer> votes) {
        if (votes.containsKey(name)){
            int num = votes.get(name);
            num += 1;
            votes.replace(name, num);
        }else {
            votes.put(name, 1);
        }
    }
}
/*
Cada usuari introduirà el nom de l'estudiant al que vota. Quan ja no hi hagi més vots escriurà END.
Imprimeix els total de vots.

Input
Mar
Mar
Ot
Iu
Ona
Iu
Mar
Mar
END

Output
Mar: 4
Ot: 1
Iu: 2
Ona: 1
 */