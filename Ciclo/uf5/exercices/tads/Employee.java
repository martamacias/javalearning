package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.Scanner;

public class Employee {
    String name;
    String lastName;
    String adress;

    public Employee(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public static Employee scanEmployee(Scanner scanner) {
        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        String adress = scanner.nextLine();
        return new Employee(name, lastName, adress);
    }
}
