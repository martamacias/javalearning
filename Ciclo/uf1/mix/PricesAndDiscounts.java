package cat.itb.martamacias7e4.dam.m03.uf1.mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PricesAndDiscounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> preus = new ArrayList<>();
        List<Integer> desc = new ArrayList<>();
        int preu = scanner.nextInt();

        while (preu!=-1){
            preus.add(preu);
            preu = scanner.nextInt();
        }
        int des = scanner.nextInt();
        while (des!=-1){
            desc.add(des);
            des = scanner.nextInt();
        }
        for (int i = 0; i < preus.size(); i++) {
            int total = preus.get(i)-(preus.get(i)*desc.get(i)/100);
            System.out.print(total+" ");
        }
    }
}
