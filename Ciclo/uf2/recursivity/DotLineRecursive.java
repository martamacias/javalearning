package cat.itb.martamacias7e4.dam.m03.uf2.recursivity;

import java.util.Scanner;

public class DotLineRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String dots = getDots(value);
        System.out.println(dots);
    }
    public static String getDots(int value){
        if (value==0){
            return "";
        }
        return "." + getDots(value-1);
    }
}
