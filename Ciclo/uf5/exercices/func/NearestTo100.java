package cat.itb.martamacias7e4.dam.m03.uf5.exercices.func;

import cat.itb.martamacias7e4.dam.m03.uf2.staticfunctions.IntegerLists;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NearestTo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = IntegerLists.readIntegerList(scanner);
        values.sort(Comparator.comparing(NearestTo100::distance100));
        int nearest = values.get(0);
        int farthest = values.get(values.size()-1);
        System.out.println("Nearest 100: "+nearest);
        System.out.println("Farthest 100: "+farthest);

    }
    public static int distance100(int value){
        return Math.abs(value-100);
    }
}
