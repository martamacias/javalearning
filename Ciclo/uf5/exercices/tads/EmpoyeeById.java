package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpoyeeById {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Employee> employees = getEmployees(scanner);
        printEmployees(scanner, employees);
    }

    private static void printEmployees(Scanner scanner, Map<String, Employee> employees) {
        String dni = scanner.nextLine();
        while (!dni.equals("END")){
            Employee employee = employees.get(dni);
            printEmployee(dni, employee);
            dni = scanner.nextLine();
        }
    }

    private static void printEmployee(String dni, Employee employee) {
        System.out.printf("%s %s - %s, %s%n", employee.name, employee.lastName, dni, employee.adress);
    }

    private static Map<String, Employee> getEmployees(Scanner scanner) {
        Map<String, Employee> employees = new HashMap<>();
        int quant = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < quant; i++) {
            String dni = scanner.nextLine();
            Employee employee = Employee.scanEmployee(scanner);
            employees.put(dni, employee);
        }
        return employees;
    }
}
/*
Una empresa vol tenir enregistrada la informació els seus empleats. De cada empleat en vol tenir el seu dni, nom, cognoms i adreça. Vol poder accedir ràpidament a les dades dels empleats segons el seu DNI.

Fes un programa que llegeixi un conjunt d'empleats per pantalla (primer introduirà la quantitat d'empleats).
Després imprimeix les dades del empleats pel DNI entrat.
Acaba el programa quan introdueixi END.

Input
2
12345678Z
Mar
Puig
Av. Pi 42
87654321T
Ot
Pi
C. Mar 33
12345678Z
87654321T
87654321T
END

Output
Mar Puig - 12345678Z, Av. Pi 42
Ot Pi - 87654321T, C. Mar 33
Ot Pi - 87654321T, C. Mar 33
 */