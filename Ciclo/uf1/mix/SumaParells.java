package cat.itb.martamacias7e4.dam.m03.uf1.mix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaParells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = scanner.nextInt();
        while (num!=-1){
            list.add(num);
            num = scanner.nextInt();
        }
        int parells = 0;
        int senars = 0;
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (i%2==0){
                senars+=value;
            }else{
                parells+=value;
            }
        }
        System.out.println(parells);
        System.out.println(senars);
    }
}
