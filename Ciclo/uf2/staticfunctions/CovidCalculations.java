package cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Covid calucation functions
 */
public class CovidCalculations {
    /**
     * Reads a list of cases from a scanner
     * @param scanner
     * @return list of daily cases
     */
    public static List<Integer> readDailyCasesFromScanner(Scanner scanner){
        List<Integer> result = new ArrayList<>();
        int value = scanner.nextInt();
        while(value!=-1){
            result.add(value);
            value = scanner.nextInt();
        }
        return result;
    }

    /**
     * Given a list of daily cases, returns the total number of cases (sum of cases)
     * @param dailyCases list of daily cases
     * @return total cases
     */
    public static int countTotalCases(List<Integer> dailyCases){
        int total = 0;
        for(int weekCases: dailyCases){
            total+=weekCases;
        }
        return total;
    }

    /**
     * iven a list of daily cases, returns the average cases count
     * @param dailyCases list of daily cases
     * @return average number
     */
    public static double average(List<Integer> dailyCases){
        return ((double)CovidCalculations.countTotalCases(dailyCases)) / dailyCases.size();
    }

    /**
     * Given a list of daily cases, returns growth between each consecutive day.
     * @param dailyCases list of daily cases
     * @return list of growths
     */
    public static List<Double> growthRates(List<Integer> dailyCases){
        List<Double> growths = new ArrayList<>();
        for(int i=0; i<dailyCases.size()-1; ++i){
            double growth = ((double) dailyCases.get(i+1)-dailyCases.get(i))/dailyCases.get(i);
            growths.add(growth);
        }
        return growths;
    }
}
