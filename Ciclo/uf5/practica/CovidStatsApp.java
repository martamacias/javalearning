package cat.itb.martamacias7e4.dam.m03.uf5.practica;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class CovidStatsApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Mirar primer el path dels arxius en la seva classe corresponent
        List<CovidCountry> covidCountryList = CovidCountry.getListCovidCountries();
        totals(covidCountryList); // Get and print totals
        tops(covidCountryList); // Get and print tops
        topEuData(covidCountryList); // Get and print top EU data
        // Spain by population
        List<Population> populations = Population.getListPopulations();
        List<ConvertCode> codes = ConvertCode.getListCodes();
        spainRelatives(populations, codes, covidCountryList); // Get and print Spain relative cases
        // EU Tops By Population
        topEuByPopulation(populations, codes, covidCountryList);
    }

    private static void topEuByPopulation(List<Population> populations, List<ConvertCode> codes, List<CovidCountry> covidCountryList) {
        // Get new codes
        List<ConvertCode> newEuCodes = getEuCodes(codes);
        Map<String, String> countryConversionMap= new HashMap<>(); // xxx -> xx
        for (ConvertCode code: newEuCodes){
            countryConversionMap.put(code.getNewCode(), code.getOldCode());
        }
        // Map of population
        Map<String, Population> popEU = new HashMap<>(); // xx -> 498489
        for (Population population: populations){
            String codePop = population.getCode();
            if (countryConversionMap.containsKey(codePop)){
                popEU.put(countryConversionMap.get(population.getCode()), population);
            }
        }
        // Get Covid Data from EU
        List<CovidCountry> euCovidData = covidCountryList.stream().
                filter(CovidStatsApp::equalsEU).collect(Collectors.toList());
        // Get % max
        double maxNewCases = 0;
        double maxTotalCases = 0;
        String nameNew = "";
        String nameTotal = "";
        for (CovidCountry country: euCovidData){
            double pop = popEU.get(country.getCode()).getPeople();
            double newCases = country.getNewCases();
            double totalCases = country.getTotalCases();
            double resultNew = (newCases/pop)*100;
            double resultTotal = (totalCases/pop)*100;
            if (resultNew>maxNewCases){
                maxNewCases = resultNew;
                nameNew = country.getName();
            }else if (resultTotal>maxTotalCases){
                maxTotalCases = resultTotal;
                nameTotal = country.getName();
            }
        }
        // Print
        String cases1 = String.format("%.2f", maxNewCases);
        String cases2 = String.format("%.2f", maxTotalCases);
        System.out.println("### Relative Tops EU ###\n" +
                "Païs amb més casos nous: " + nameNew + " - " + cases1 + "%\n" +
                "Païs amb més casos totals: " + nameTotal + " - " + cases2 + "%");
    }

    private static List<ConvertCode> getEuCodes(List<ConvertCode> codes) {
        return codes.stream().filter(CovidStatsApp::equalsEuCodes).collect(Collectors.toList());
    }

    private static boolean equalsEuCodes(ConvertCode convertCode) {
        List<String> oldEuCodes = Arrays.asList("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL");
        return oldEuCodes.stream().anyMatch(eUCode -> convertCode.getOldCode().equals(eUCode));
    }

    private static void spainRelatives(List<Population> populations, List<ConvertCode> codes, List<CovidCountry> covidCountryList) {
        String oldCode = "ES";
        String newCode = getSpainNewCode(codes);
        // Get population
        double popul = populations.stream().filter(p -> p.getCode().equals(newCode)).findFirst().get().getPeople();
        // Get new relative cases
        int newCases = covidCountryList.stream().filter(c -> c.getCode().equals(oldCode)).findFirst().get().getNewCases();
        double newRelCases = (newCases/popul)*100;
        // Get total relative cases
        int totalCases = covidCountryList.stream().filter(c -> c.getCode().equals(oldCode)).findFirst().get().getTotalCases();
        double totalRelCases = (totalCases/popul)*100;
        // Print
        String cases1 = String.format("%.2f", newRelCases);
        String cases2 = String.format("%.2f", totalRelCases);
        System.out.println("### Spain Relative ###\n" +
                "casos nous relatius: " + cases1 + "%\n" +
                "casos totals relatius: " + cases2 + "%");
    }

    private static String getSpainNewCode(List<ConvertCode> codes) {
        return codes.stream().filter(code -> code.getOldCode().equals("ES")).findFirst().get().getNewCode();
    }

    private static void topEuData(List<CovidCountry> covidCountryList) {
        // Filter by EU
        List<CovidCountry> streamCovid1 = covidCountryList.stream().
                filter(CovidStatsApp::equalsEU).collect(Collectors.toList());
        // Get country name with top new cases
        String countryMaxNewCases = Collections.max(streamCovid1, Comparator.comparing(CovidCountry::getNewCases)).getName();
        // Get country name with top new total cases
        String countryMaxNewTotalCases = Collections.max(streamCovid1, Comparator.comparing(CovidCountry::getTotalCases)).getName();
        // Print
        System.out.printf("### Tops EU ###\n" +
                "Païs amb més casos nous: %s\n" +
                "Païs amb més casos totals: %s\n", countryMaxNewCases, countryMaxNewTotalCases);
    }

    private static boolean equalsEU(CovidCountry covidCountry) {
        List<String> eUCodes = Arrays.asList("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL");
        return eUCodes.stream().anyMatch(eUCode -> covidCountry.getCode().equals(eUCode));
    }

    private static void tops(List<CovidCountry> covidCountryList) {
        // Get max new cases
        int maxNewCases = covidCountryList.stream().map(CovidCountry::getNewCases).reduce(0, Integer::max);
        // Get max toal cases
        int maxTotalCases = covidCountryList.stream().map(CovidCountry::getTotalCases).reduce(0, Integer::max);
        // Print
        System.out.printf("### Tops ###\n" +
                "Païs amb més casos nous: %s\n" +
                "Païs amb més casos totals: %s\n", maxNewCases, maxTotalCases);
    }

    private static void totals(List<CovidCountry> covidCountryList) {
        // Get total cases
        int totalCases = covidCountryList.stream().map(CovidCountry::getTotalCases).reduce(0, Integer::sum);
        // Get new total cases
        int newTotalCases = covidCountryList.stream().map(CovidCountry::getNewCases).reduce(0, Integer::sum);
        // Print
        System.out.printf("### DADES TOTALS ###\n" +
                "casos nous: %s\n" +
                "casos totals: %s\n", newTotalCases, totalCases);
    }
}
