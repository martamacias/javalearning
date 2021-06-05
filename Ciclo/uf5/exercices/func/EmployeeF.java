package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeF {
    String dni;
    String name;
    String lastName;
    String adress;

    public EmployeeF(String dni, String name, String lastName, String adress) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }
    public static EmployeeF readEmployee(Scanner scanner) {
        String dni = scanner.nextLine();
        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        String adress = scanner.nextLine();
        return new EmployeeF(dni, name, lastName, adress);
    }
    public static List<EmployeeF> listEmployees(Scanner scanner){
        List<EmployeeF> employees = new ArrayList<>();
        int quant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < 2; i++) {
            EmployeeF employeeF = readEmployee(scanner);
            employees.add(employeeF);
        }
        return employees;
    }
    public static void printEmployeeF(EmployeeF employeeF){
        System.out.printf("%s %s - %s, %s", employeeF.name, employeeF.lastName, employeeF.dni, employeeF.adress);
    }
}
