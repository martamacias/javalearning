package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;

import java.util.List;
import java.util.Scanner;

public class StudentStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = IntegerLists.readIntegerList(scanner);
        System.out.println("Nota mínima:  "+IntegerLists.min(lista));
        System.out.println("Nota màxima:  "+IntegerLists.max(lista));
        System.out.println("Nota mitjana: "+IntegerLists.avg(lista));
    }
}
