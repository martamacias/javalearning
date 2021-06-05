package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

/*Volem contar quantes línies té un text introduït per l'usuari.
L'usuari introduiex un text per pantalla que pot tenir salts de línia.
Per indicar que ha acabat d'introduïr el text escriurà una línia amb la paraula clau END
Imprimeix el nombre de línies que ha introduït l'usuari (sense contar la END)
*/

import java.util.Scanner;

public class HowManyLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int i = 0;
        while (! line.equals("END")) {
            line = scanner.nextLine();
            i++;
        }
        System.out.println(i);
    }
}
