package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class WhichPizzaShouldIBuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Posa el diàmetre de la pizza rodona");
        double pizzaDiameter = scanner.nextDouble();
        System.out.println("Posa els costats de la pizza rectangular");
        double pizzaLength = scanner.nextInt();
        double pizzaWidth = scanner.nextInt();

        double pizza1 = ((pizzaDiameter / 2) * (pizzaDiameter / 2) * 3.1416);
        double pizza2 = pizzaLength * pizzaWidth;

        if (pizza1>pizza2){
            System.out.println("Compra la rodona.");
        }else{
            System.out.println("Compra la rectangular.");
        }
    }
}
