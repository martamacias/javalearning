package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf2.dataclasses.Salary;

import java.util.List;
import java.util.Scanner;

public class FromAvgSallaryInfoStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Salary> salaries = Salary.getListSalary(scanner);
        double averageSalary = salaries.stream().mapToDouble(Salary::getMoney).average().getAsDouble();
        salaries.stream()
                .filter(salary -> (salary.getMoney()<averageSalary))
                .forEach(salary -> System.out.println(salary.getName()));
    }
}
/*
Fes l'exercici UF2.FromAvgSallaryInfo (pots usar les classes ja fetes), però fes els càlculs (mitjana i filtre) usant streams

Exercici:
En una empresa ens diuen que volen coneixer el salari mitjà dels seus treballadors, i veure quin cobra per sota.
Primer l'usuari introduirà quans treballadors hi ha. Després introduirà una línia per cada treballador amb el seu sou, i el seu nom.

Un cop introduits els treballadors printa per pantalla el nom dels treballadors que cobren per sota del sou mitjà.

input:

3
3000 Mar
3500 Ona
2500 Ot

output:
Ot
 */