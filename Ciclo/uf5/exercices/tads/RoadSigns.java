package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.*;

public class RoadSigns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> cartells = getCartells(scanner);
        //System.out.println(cartells);
        compareLocations(scanner, cartells);
    }

    private static void compareLocations(Scanner scanner, Map<Integer, String> cartells) {
        int metre = scanner.nextInt();
        while (metre!=-1){
            String coinc = cartells.getOrDefault(metre, "no hi ha cartell");
            System.out.println(coinc);
            metre = scanner.nextInt();
        }
    }

    private static Map<Integer, String> getCartells(Scanner scanner) {
        Map<Integer, String> cartells = new HashMap<>();
        int quant = scanner.nextInt();
        for (int i=0;i<quant;i++){
            int metres = scanner.nextInt();
            String nom = scanner.next();
            cartells.put(metres, nom);
        }
        return cartells;
    }

}
/*
Volem tenir registrats els diferents cartells que té una carretera. La carretera fa més del 1000km, i volem registrar el metre al que hi ha al cartell.
Posteriorment volem poder obtenir el cartell que hi ha a un metre determinat.

L'usuari primer introduirà el número de cartells, i per cada cartell el metre i el text.
Després introduirà un metre i s'ha d'imprimir el cartell o no hi ha cartell.
S'acaba quan l'usuari introdueix -1.

Input
3
103 Lorem
164829 Ipsum
36837 Dolor
97362
164829
103
-1
Output
no hi ha cartell
Ipsum
Lorem
 */