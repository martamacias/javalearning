package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.Scanner;

public class School {
    String name;
    String adress;
    String postalCode;
    String city;
    public School(String name, String adress, String postalCode, String city){
        this.name = name;
        this.adress = adress;
        this.postalCode = postalCode;
        this.city = city;
    }

    public  String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }

    /**
     * read the values of the class school
     * @param scanner
     * @return the values of school
     */
    public static School readSchool(Scanner scanner) {
        String name = scanner.nextLine();
        String adress = scanner.nextLine();
        String postalCode = scanner.nextLine();
        String city = scanner.nextLine();
        School school = new School(name, adress, postalCode, city);
        return school;
    }

    /**
     * print school in the correct format
     * @param school
     */
    public static void printSchool(School school) {
        String name = school.getName();
        String adress = school.getAdress();
        String postalCode = school.getPostalCode();
        String city = school.getCity();
        System.out.println(name);
        System.out.println("adreça: "+adress);
        System.out.println("codipostal: "+postalCode);
        System.out.println("ciutat: "+city);
    }

}