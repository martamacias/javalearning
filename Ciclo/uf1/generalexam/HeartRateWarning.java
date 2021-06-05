package cat.itb.martamacias7e4.dam.m03.uf1.generalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartRateWarning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        List<Integer> ritmes = new ArrayList<>();
        int ritme = scanner.nextInt();
        while (ritme != -1) {
            ritmes.add(ritme);
            ritme = scanner.nextInt();
        }
        for (int i = 0; i < ritmes.size()-2; i++) {
            if (ritmes.get(i)>max && ritmes.get(i+1)>max && ritmes.get(i+2)>max){
                System.out.println("MASSA ALT");
            }else if (ritmes.get(i+2)<min && ritmes.get(i+1)<min && ritmes.get(i)<min){
                System.out.println("MASSA BAIX");
            }
        }
    }
}
