package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import cat.itb.martamacias7e4.dam.m03.uf2.classfun.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class BuyListInFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = Product.readProducts(scanner);
        scanner.nextLine();
        String pathUser = scanner.nextLine();
        Path path = Paths.get(pathUser);
        writeProduct(path, products);
    }

    private static void writeProduct(Path path, List<Product> products) throws IOException {
        /*Files.writeString(path, "-------- Compra --------%n");
        productsToFile(path, products);
        Files.writeString(path, "-------------------------%n" +
                Product.calculateAll(products) +
                "%n-------------------------");*/
    }

    private static void productsToFile(Path path, List<Product> products) throws IOException {
        String forrmat2 = String.format("");
        for (Product product: products){
            Files.writeString(path, stringProduct(product));
        }
    }

    private static String stringProduct(Product product) {
        int num = product.getNum();
        String name = product.getName();
        double price = product.getPrice();
        double total = Product.getTotal(product);
        return  String.format("%d %s (%.2f€) - %.2f€%n", num, name, price, total);
    }
}
// /home/sjo/productList.txt