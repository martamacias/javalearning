package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;

import java.util.List;
import java.util.Scanner;

public class OldestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = IntegerLists.readIntegerList(scanner);
        System.out.println("L'alumne més gran té "+IntegerLists.max(lista)+" anys");
    }
}
