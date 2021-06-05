package cat.itb.martamacias7e4.dam.m03.uf1.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StrangeCountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int lenght = b-(a+1);

        for (int i=0; i<lenght; i++){
            list.add(i,a+i+1);
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
/*Demana a l'usuari dos enters. Imprimeix per pantalla els números que hi ha entre els dos enters, alternant,
el més petit amb el més gran.
input: 3 9
output: 4 8 5 7 6*/