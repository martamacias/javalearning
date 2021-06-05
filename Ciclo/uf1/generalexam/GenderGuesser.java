package cat.itb.martamacias7e4.dam.m03.uf1.generalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenderGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> noms = new ArrayList<>();
        String nom = scanner.next();
        while (!nom.equals("END")){
            noms.add(nom);
            nom = scanner.next();
        }
        for (String element: noms) {
            if (element.endsWith("a")){
                System.out.println("femení");
            }else if (element.endsWith("s")){
                System.out.println("plural");
            }else {
                System.out.println("masculí");
            }
        }
    }
}