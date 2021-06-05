package cat.itb.martamacias7e4.dam.m03.uf5.practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CovidCountry {
    String name;
    String code;
    int newCases;
    int totalCases;
    int newDeaths;
    int totalDeaths;
    int newRecover;
    int totalRecover;

    public CovidCountry(String name, String code, int newCases, int totalCases, int newDeaths, int totalDeaths, int newRecover, int totalRecover) {
        this.name = name;
        this.code = code;
        this.newCases = newCases;
        this.totalCases = totalCases;
        this.newDeaths = newDeaths;
        this.totalDeaths = totalDeaths;
        this.newRecover = newRecover;
        this.totalRecover = totalRecover;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getNewCases() {
        return newCases;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public int getNewDeaths() {
        return newDeaths;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public int getNewRecover() {
        return newRecover;
    }

    public int getTotalRecover() {
        return totalRecover;
    }
    private static File getCovidDataFile() {
        String userPath = "C:\\Users\\macia\\OneDrive\\Escriptori\\DAM\\martaM03\\dam-m03-uf1-data\\src\\cat\\itb\\martamacias7e4\\dam\\m03\\uf5\\practica\\coviddata.txt";
        return new File(userPath);
    }
    public static List<CovidCountry> getListCovidCountries() throws FileNotFoundException {
        File covidData = getCovidDataFile();
        Scanner scanCovidFile = new Scanner(covidData);
        List<CovidCountry> list = new ArrayList<>();
        while (scanCovidFile.hasNext()){
            list.add(readCountry(scanCovidFile));
        }
        return list;
    }

    public static CovidCountry readCountry(Scanner filesScan) {
        String name = filesScan.nextLine();
        String code = filesScan.nextLine();
        int newCases = filesScan.nextInt();
        int totalCases = filesScan.nextInt();
        int newDeaths = filesScan.nextInt();
        int totalDeaths = filesScan.nextInt();
        int newRecover = filesScan.nextInt();
        int totalRecover = filesScan.nextInt();
        filesScan.nextLine();
        return new CovidCountry(name, code, newCases, totalCases, newDeaths, totalDeaths, newRecover, totalRecover);
    }
}
/*
 nom, codi, casos nous confirmats, total confirmat, noves morts, morts totals nous recuperats i recuperats totals.
 */