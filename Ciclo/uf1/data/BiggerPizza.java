package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class BiggerPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pizzaDiameter = scanner.nextDouble();
        double pizzaLength = scanner.nextInt();
        double pizzaWidth = scanner.nextInt();

        double pizza1 = ((pizzaDiameter / 2) * (pizzaDiameter / 2) * 3.1416);
        double pizza2 = pizzaLength * pizzaWidth;

        boolean biggerPizza = pizza1 > pizza2;

        System.out.println(biggerPizza);
    }
}
