package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.List;
import java.util.Scanner;

public class FromAvgSallaryInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int[] listMoney = new int[quantity];
        String[] listNames = new String[quantity];

        int i = 0;
        int suma = 0;
        while (i < quantity) {
            Salary salary = Salary.readSalary(scanner);
            listMoney[i] = salary.getMoney();
            suma += listMoney[i];
            listNames[i] = salary.getName();
            i++;
        }

        int avg = (int) suma/quantity;
        for (int j = 0; j < quantity; j++) {
            if (listMoney[j]<avg){
                System.out.println(listNames[j]);
            }
        }
    }
}
