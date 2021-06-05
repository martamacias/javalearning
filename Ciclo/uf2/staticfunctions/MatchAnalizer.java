package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchAnalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equip1 = scanner.next();
        String equip2 = scanner.next();
        List<Integer> marcador = new ArrayList<>();
        int punts = scanner.nextInt();
        while (punts!=-1){
            marcador.add(punts);
            punts = scanner.nextInt();
        }
        for (int i = 0; i < marcador.size()-2; i++) {
            int punt1 = marcador.get(i);
            int punt2 = marcador.get(i+2);
        }
    }
}
