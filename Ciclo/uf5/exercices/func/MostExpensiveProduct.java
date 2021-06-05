package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf2.dataclasses.Product;

import java.util.*;

public class MostExpensiveProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = readProducts(scanner);
        Product maxProductPrice = Collections.max(products, Comparator.comparing(Product::getPrice));
        Product.printProduct(maxProductPrice);
    }

    private static List<Product> readProducts(Scanner scanner) {
        List<Product> products = new ArrayList<>();
        String name = scanner.next();
        while (!name.equals("END")){
            double price = scanner.nextDouble();
            Product product = new Product(name, price);
            products.add(product);
            name = scanner.next();
        }
        return products;
    }
}
/*
Llegeix un conjunt de productes, i imprimeix per pantalla el més car

Input
Taula 232,32 Cadira 90,90 Bolígraf 76,22 END

Output
El producte Taula val 232.32€

 */