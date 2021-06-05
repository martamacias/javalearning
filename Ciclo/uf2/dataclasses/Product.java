package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.Scanner;

public class Product {
    String name;
    double price;

    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public static Product readProduct(Scanner scanner) {
        String name = scanner.next();
        double price = scanner.nextDouble();
        Product product = new Product(name, price);
        return product;
    }
    public static void printProduct(Product product) {
        String name = product.getName();
        double price = product.getPrice();
        System.out.printf("El producte %s val %.2f€\n", name, price);
    }
}
