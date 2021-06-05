package cat.itb.martamacias7e4.dam.m03.uf5.practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Population {
    String code;
    long people;

    public Population(String code, long people) {
        this.code = code;
        this.people = people;
    }

    public String getCode() {
        return code;
    }

    public long getPeople() {
        return people;
    }
    private static File getPopulationFile() {
        String userPath = "C:\\Users\\macia\\OneDrive\\Escriptori\\DAM\\martaM03\\dam-m03-uf1-data\\src\\cat\\itb\\martamacias7e4\\dam\\m03\\uf5\\practica\\population.txt";
        return new File(userPath);
    }

    public static List<Population> getListPopulations() throws FileNotFoundException {
        File popFile = getPopulationFile(); // Popilation file to list
        Scanner scanPopFile = new Scanner(popFile);
        List<Population> list = new ArrayList<>();
        while (scanPopFile.hasNext()){
            list.add(readPopulation(scanPopFile));
        }
        return list;
    }

    private static Population readPopulation(Scanner scanPopFile) {
        String code = scanPopFile.next();
        long people = scanPopFile.nextLong();
        scanPopFile.nextLine();
        return new Population(code, people);
    }
}
