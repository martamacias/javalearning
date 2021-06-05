package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salary {
    int money;
    String name;

    public Salary (int money, String name){
        this.money = money;
        this.name = name;
    }
    public int getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public static Salary readSalary(Scanner scanner) {
        int money = scanner.nextInt();
        String name = scanner.next();
        return new Salary(money, name);

    }
    public static List<Salary> getListSalary(Scanner scanner){
        List<Salary> salaries = new ArrayList<>();
        int quant = scanner.nextInt();
        for (int i = 0; i < quant; i++) {
            salaries.add(readSalary(scanner));
        }
        return salaries;
    }
}
