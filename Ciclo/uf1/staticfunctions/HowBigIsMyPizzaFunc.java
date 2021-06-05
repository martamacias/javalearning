package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;

public class HowBigIsMyPizzaFunc {
    public static void main(String[] args) {
        // Prepare to read values from input.
        Scanner scanner = new Scanner(System.in);
        // Reads a double
        double pizzaDiameter = scanner.nextDouble();

        double area = pizzaArea(pizzaDiameter);
        System.out.println(area);
    }

    private static double pizzaArea(double pizzaDiameter) {
        return (pizzaDiameter/2)*(pizzaDiameter/2)*3.1416;
    }
}
