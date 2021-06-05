package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorExercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = IntegerLists.readIntegerList(scanner);
        Iterator<Integer> itera = list.iterator();
        while (itera.hasNext()){
            int value = itera.next();
            if (value%2==0)
                itera.remove();
        }
        // ALTRE OPCIO
        //list.removeIf(value -> value % 2 == 0);
        System.out.println(list);
    }
}
/*
Llegeix una llista d'enters per consola (usa IntegerLists.readIntegerList).
Elimina els enters que són parells
Imprimeix la llista per pantalla
Input
3 8 43 2 3 43 234 34 432 3 32 4 -1

Output
[3, 43, 3, 43, 3]
 */