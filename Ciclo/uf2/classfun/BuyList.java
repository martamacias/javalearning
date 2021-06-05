package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = Product.readProducts(scanner);
        Product.printBuyList(products);
    }
}
/*
Fes un programa que ens ajudi a crear una llista de la compra.
L'suauri introduirà primer el nombre de productes.
Per cada producte el nom, el preu i la quantitat que en vol comprar.
Quan acabi imprimeix el resum de la compra.

Input
4
1 Macarrons 2,35
8 Peres 0,35
1 Llet 1,32
2 Galetes 1,23

Output
-------- Compra --------
1 Macarrons (2.35€) - 2.35€
8 Peres (0.35€) - 2.80€
1 Llet (1.32€) - 1.32€
2 Galetes (1.23€) - 2.46€
-------------------------
Total: 8.93€
-------------------------
 */