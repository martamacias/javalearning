package cat.itb.martamacias7e4.dam.m03.uf2.generalexam;

import java.util.List;
import java.util.Scanner;

public class LibertySpeechApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Country> countries = Country.listCountries(scanner);
        printCountries(countries);
    }

    private static void printCountries(List<Country> countries ){
        System.out.printf("---------- Paisos ----------%n");
        for (Country country: countries) {
            System.out.printf("%s - casos: %d - gravetat: %.1f - puntuació: %d%n", country.readCountry(), country.getCases(), country.getGrav(), Country.getPunt(country, countries));
        }
        System.out.printf("---------- Resum ----------%n");
        System.out.printf("Casos totals: %d%n", Country.totalCases(countries));
        System.out.printf("País amb més casos: %s%n", Country.getMax(countries));
    }
}