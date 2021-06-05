package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    String nom;
    String capital;
    int superficie;
    int densitat;

    public Country(String nom, String capital, int superficie, int densitat) {
        this.nom = nom;
        this.capital = capital;
        this.superficie = superficie;
        this.densitat = densitat;
    }

    public String getNom() {
        return nom;
    }

    public String getCapital() {
        return capital;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getDensitat() {
        return densitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setDensitat(int densitat) {
        this.densitat = densitat;
    }

    public void printCountry() {
        System.out.printf("%s %s %d %d%n", getNom(), getCapital(), getSuperficie(), getDensitat());
    }

    public static Country readCountry(Scanner scanner){
        String nom = scanner.next();
        String capital = scanner.next();
        int superficie = scanner.nextInt();
        int densitat = scanner.nextInt();
        return new Country(nom, capital, superficie, densitat);
    }
    public static List<Country> readListCountries(Scanner scanner) {
        List<Country> countries = new ArrayList<>();
        int quant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quant; i++) {
            Country country = readCountry(scanner);
            countries.add(country);
        }
        return countries;
    }

    @Override
    public String toString() {
        return nom+" "+capital+" "+superficie+" "+densitat;
    }
}
