package cat.itb.martamacias7e4.dam.m03.uf2.generalexam;

import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    String country;
    int cases;
    double grav;

    public Country(String country, int cases, double grav) {
        this.country = country;
        this.cases = cases;
        this.grav = grav;
    }

    public String readCountry() {
        return country;
    }

    public int getCases() {
        return cases;
    }

    public double getGrav() {
        return grav;
    }
    public static Country readCountry(Scanner scanner){
        String country = scanner.next();
        int cases = scanner.nextInt();
        double grav = scanner.nextDouble();
        return new Country(country, cases, grav);
    }

    public static List<Country> listCountries(Scanner scanner) {
        int quant = scanner.nextInt();
        List<Country> countries = new ArrayList<>();
        for (int i=0; i<quant; i++){
            Country country = readCountry(scanner);
            countries.add(country);
        }
        return countries;
    }

    public static int getPunt(Country country, List<Country> countries) {
        return country.getCases() * (int) country.getGrav();
    }
    public static int totalCases(List<Country> countries) {
        int suma = 0;
        for (Country country: countries) {
            suma += country.getCases();
        }
        return suma;
    }
    public static String getMax(List<Country> countries) {
        int maxValue = 0;
        String name = "";
        for (Country country: countries){
            if (maxValue< country.getCases()){
                maxValue = country.getCases();
                name = country.readCountry();
            }
        }
        return name;
    }
}
