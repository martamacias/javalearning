package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.*;

public class PassaLlista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> alumnes = new ArrayList<>(Arrays.asList("Magalí", "Magdalena", "Magí", "Manel", "Manela", "Manuel", "Manuela", "Mar", "Marc",
                "Margalida", "Marçal", "Marcel", "Maria", "Maricel", "Marina", "Marta", "Martí", "Martina"));
        int position = scanner.nextInt();
        while (position != -1){
            alumnes.remove(position);
            position = scanner.nextInt();
        }
        System.out.println(alumnes);
    }
}
/*Volem fer un programa que ens digui quins alumnes no han vingut a classe.

L'usuari introduirà enters ordenats de menor a major, indicant la posició dels alumnes que han vingut a classe.
Quan introdueixi un -1 és que ja ha acabat.

Tenim la següent llista de alumnes:
"Magalí", "Magdalena", "Magí", "Manel", "Manela", "Manuel", "Manuela", "Mar", "Marc",
"Margalida", "Marçal", "Marcel", "Maria", "Maricel", "Marina", "Marta", "Martí", "Martina"

input: 0 1 2 3 -1
output: [Manela, Manuel, Manuela, Mar, Marc, Margalida, Marçal, Marcel, Maria,
Maricel, Marina, Marta, Martí, Martina]*/