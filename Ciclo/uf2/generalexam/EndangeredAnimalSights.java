package cat.itb.martamacias7e4.dam.m03.uf2.generalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndangeredAnimalSights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Especie> especies = readListEspecies(scanner);
        List<Avistament> avistaments = readListAvist(scanner);
        printAvist(especies, avistaments);
        printResum(especies);
    }
    private static List<Especie> readListEspecies(Scanner scanner) {
        int quant = scanner.nextInt();
        scanner.nextLine();
        List<Especie> especies = new ArrayList<>();
        for (int i=0; i<quant; i++){
            Especie especie = Especie.readEspecie(scanner);
            especies.add(especie);
        }
        return especies;
    }
    private static List<Avistament> readListAvist(Scanner scanner) {
        int quant = scanner.nextInt();
        List<Avistament> avistaments = new ArrayList<>();
        for (int i=0; i<quant; i++){
            Avistament avistament = Avistament.readAvist(scanner);
            avistaments.add(avistament);
        }
        return avistaments;
    }
    private static void printAvist(List<Especie> especies, List<Avistament> avistaments) {
        System.out.printf("----- Avistaments -----%n");
        for (Avistament avistament: avistaments) {
            int position = avistament.getPosition();
            int quant = avistament.getQuant();
            Especie especie = especies.get(position);
            int total = especie.getTotal() + quant;
            especie.setTotal(total);
            System.out.printf("%s - %s: %d%n", especie.getCientific(), especie.getComu(), quant);
        }
    }
    private static void printResum(List<Especie> especies) {
        System.out.printf("----- Resum -----%n");
        for (Especie especie: especies){
            System.out.printf("%s - %s: %d%n", especie.getCientific(), especie.getComu(), especie.getTotal());
        }
    }
}
/*
Input
3
Mustela putorius
fura de bosc
Canis lupus
Llop
Testudo hermanni
Tortuga mediterrània
5
0 2
0 1
1 1
2 1
0 2
Output
----- Avistaments -----
Mustela putorius - fura de bosc: 2
Mustela putorius - fura de bosc: 1
Canis lupus - Llop: 1
Testudo hermanni - Tortuga mediterrània: 1
Mustela putorius - fura de bosc: 2
----- Resum -----
Mustela putorius - fura de bosc: 5
Canis lupus - Llop: 1
Testudo hermanni - Tortuga mediterrània: 1
 */