package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import java.util.List;
import java.util.Scanner;

public class FilterEmpoyeeById {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<EmployeeF> employees = EmployeeF.listEmployees(scanner);
        employees.removeIf(FilterEmpoyeeById::containsA);
        employees.forEach(EmployeeF::printEmployeeF);
    }

    private static boolean containsA(EmployeeF employeeF) {
        return employeeF.dni.contains("A");
    }
}
/*
Usa la classe Employee de l'exercici EmpoyeeById, llegeix una llista (List) d'empleats per pantalla
(primer s'introduirà el número d'empleats).

Elimina els empleats que tenen un DNI amb la lletra A i imprimeix la llista resultant.

Input
2
12345678Z
Mar
Puig
Av. Pi 42
87654321A
Ot
Pi
C. Mar 33

Output
Ot Pi - 87654321A, C. Mar 33
 */