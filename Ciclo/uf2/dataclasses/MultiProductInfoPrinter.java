package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.Scanner;

public class MultiProductInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int products = scanner.nextInt();
        int i = 0;
        while (i < products){
            Product product = Product.readProduct(scanner);
            Product.printProduct(product);
            i++;
        }
    }
}
/*
3
Taula
232,32
Cadira
90,90
Bolígraf
76,22

*/