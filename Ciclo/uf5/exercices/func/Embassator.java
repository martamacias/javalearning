package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Embassator {
    String name;
    String cognom;
    Country country;

    public Embassator(String name, String cognom, Country country) {
        this.name = name;
        this.cognom = cognom;
        this.country = country;
    }

    public static List<Embassator> readListEmbassators(Scanner scanner, List<Country> countries) {
        List<Embassator> embassators = new ArrayList<>();
        int quant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quant; i++) {
            Embassator embassator = readEmbassator(scanner, countries);
            embassators.add(embassator);
        }
        return embassators;
    }

    private static Embassator readEmbassator(Scanner scanner, List<Country> countries) {
        String name = scanner.nextLine();
        String cognom = scanner.nextLine();
        String countryName = scanner.nextLine();
        Country country = countries.stream().filter(c -> c.nom.equals(countryName)).findFirst().get();
        return new Embassator(name, cognom, country);
    }

    public String getName() {
        return name;
    }

    public String getCognom() {
        return cognom;
    }

    public Country getCountry() {
        return country;
    }

    public String getCountryName() {
        return country.getNom();
    }

    public int getCountrySuperficie(){
        return country.getSuperficie();
    }

    @Override
    public String toString() {
        return name+" "+cognom+" "+country;
    }

}
