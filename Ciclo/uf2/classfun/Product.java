package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    int num;
    String name;
    double price;

    public Product(int num, String name, double price){
        this.num = num;
        this.name = name;
        this.price = price;
    }

    public int getNum() {
        return num;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    /**
     * each product to list products
     * @param scanner
     * @return products
     */
    public static List<Product> readProducts(Scanner scanner) {
        int quant = scanner.nextInt();
        List<Product> products = new ArrayList<>();
        int i = 0;
        while (i<quant){
            Product product = Product.readProduct(scanner);
            products.add(product);
            i++;
        }
        return products;
    }

    /**
     * //Llegir int num, string name, double price = class Product
     * @param scanner
     * @return product
     */
    public static Product readProduct(Scanner scanner) {
        //System.out.println("introduce int");
        int num = scanner.nextInt();
        //System.out.println("introduce string");
        String name = scanner.next();
        //System.out.println("introduce double");
        double price = scanner.nextDouble();
        return new Product(num, name, price);
    }
    /**
     * Sumar els preus i imprimir la llista
     * @param products
     */
    public static void printBuyList(List<Product> products) {
        System.out.println("-------- Compra --------");
        for (Product product: products){
            printProduct(product);
        }
        System.out.println("-------------------------");
        printCalculateAll(products);
        System.out.println("-------------------------");
    }

    public static void printCalculateAll(List<Product> products) {
        double all = calculateAll(products);
        System.out.printf("Total: %.2f€\n", all);
    }

    public static double calculateAll(List<Product> products) {
        double all = 0;
        for (Product product: products){
            all += getTotal(product);
        }
        return all;
    }

    /**
     * print each product from list products
     * @param product
     */
    private static void printProduct(Product product) {
        int num = product.getNum();
        String name = product.getName();
        double price = product.getPrice();
        double total = getTotal(product);
        System.out.printf("%d %s (%.2f€) - %.2f€\n", num, name, price, total);
    }

    public static double getTotal(Product product) {
        return product.price*product.num;
    }

}
