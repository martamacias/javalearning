package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.Scanner;

public class OneProductInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = Product.readProduct(scanner);
        Product.printProduct(product);
    }
}
