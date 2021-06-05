package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static cat.itb.martamacias7e4.dam.m03.uf5.exercices.func.Country.readListCountries;
import static cat.itb.martamacias7e4.dam.m03.uf5.exercices.func.Embassator.readListEmbassators;

public class EmbassatorsByBiggestCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Country> countries = readListCountries(scanner);
        List<Embassator> embassators = readListEmbassators(scanner, countries);
        embassators.sort(Comparator.comparing(Embassator::getCountrySuperficie).reversed()
                .thenComparing(Embassator::getCognom)
                .thenComparing(Embassator::getName));
        embassators.forEach(System.out::println);
    }
}
/*
Ens volem guardar la informació de diferents embaixadors que hi ha a la nostre ciutat. Cada enbaixador ho és d'un país determinat.

Llegeix els països i els embaixadors.

Imprimeix per pantalla els diferents embaixadors ordenats per la mida del païs que representen (el més gran primer).
En cas d'empat per ordre alfabètic dels cognoms i en cas d'empat per ordre alfabètic del nom.

Input
3
Peru Lima 1285216 24
Australia Canberra 7702466 3
Marroc Casablanca 446650 66
4
Mar
Pi
Peru
Ot
Om
Australia
Ona
Puig
Peru
Iun
Puig
Peru

 */