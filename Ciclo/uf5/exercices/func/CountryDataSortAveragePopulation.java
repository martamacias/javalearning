package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.List;
import java.util.Scanner;

public class CountryDataSortAveragePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Country> countries = Country.readListCountries(scanner);
        double average = countries.stream()
                .filter(country -> (country.getSuperficie()<1200000))
                .mapToDouble(CountryDataSortAveragePopulation::getPopulation)
                .average().getAsDouble();
        System.out.println(average);
    }

    private static double getPopulation(Country country) {
        return country.getDensitat()* country.getSuperficie();
    }
}
/*
Imprimeix la mitjana de poblacio dels països de menys de 1200000 km2.

Input
5
Peru Lima 1285216 24
Australia Canberra 7702466 3
Marroc Casablanca 446650 66
Russia Moscou 17098242 8
Islandia Reikiavik 102800 3

 */