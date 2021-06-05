package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CountryDataSortByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Country> countries = Country.readListCountries(scanner);
        countries.stream()
                .filter(CountryDataSortByName::densityMore5)
                .sorted(Comparator.comparing(Country::getNom))
                .forEach(Country::printCountry);
    }

    private static boolean densityMore5(Country country) {
        return country.getDensitat()>5;
    }
}
/*
D'un païs ens en volem guardar la següent informació.

nom, capital, superfície(km2), densitat (hab./km2)
Imprimeix els països de més de amb una densitat superior a 5hab/km2, ordenats per ordre alfabètic.

L'usuari primer introduirà la quantitat de països a llegir.

Imprimeix els paisos ordenats per ordre alfabètic.

Input
5
Peru Lima 1285216 24
Australia Canberra 7702466 3
Marroc Casablanca 446650 66
Russia Moscou 17098242 8
Islandia Reikiavik 102800 3

 */