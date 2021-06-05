package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;

import java.util.List;
import java.util.Scanner;

public class CovidApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = CovidCalculations.readDailyCasesFromScanner(scanner);
        List<Double> growths = CovidCalculations.growthRates(result);
        double growth = growths.get(growths.size()-1);
        System.out.println("Hi ha hagut "+CovidCalculations.countTotalCases(result)+" casos en total, amb una mitjana de "
                +String.format("%.2f", CovidCalculations.average(result))+" per dia.\n" +
                "L'útlim creixement és de "+String.format("%.2f", growth));
    }
}
