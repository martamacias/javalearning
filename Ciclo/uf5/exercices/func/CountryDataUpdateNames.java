package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CountryDataUpdateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Country> countries = Country.readListCountries(scanner);
        countries.stream()
                .map(country -> {
                    country.setNom(country.getNom().toUpperCase());
                    country.setCapital(country.getCapital().toUpperCase());
                    return country;
                })
                .forEach(Country::printCountry);
    }
}
/*
Llegeix per pantalla una llista de països, modifica'n el nom i la capital per a que estiguin escrites en majúscules i imprimeix-los.

Input
5
Peru Lima 1285216 24
Australia Canberra 7702466 3
Marroc Casablanca 446650 66
Russia Moscou 17098242 8
Islandia Reikiavik 102800 3

Output
PERU LIMA 1285216 24
AUSTRALIA CANBERRA 7702466 3
MARROC CASABLANCA 446650 66
RUSSIA MOSCOU 17098242 8
ISLANDIA REIKIAVIK 102800 3
 */