package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;

public class BiggerPizzaFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pizzaDiameter = scanner.nextDouble();
        double pizzaLength = scanner.nextInt();
        double pizzaWidth = scanner.nextInt();

        //double pizza1 = ((pizzaDiameter / 2) * (pizzaDiameter / 2) * 3.1416);
        //double pizza2 = pizzaLength * pizzaWidth;

        boolean biggerPizza = pizza1func(pizzaDiameter) > pizza2func(pizzaLength,pizzaWidth);

        System.out.println(biggerPizza);
    }

    private static double pizza2func(double pizzaLength, double pizzaWidth) {
        return pizzaLength * pizzaWidth;
    }

    private static double pizza1func(double pizzaDiameter) {
        return (pizzaDiameter / 2) * (pizzaDiameter / 2) * 3.1416;
    }
}
