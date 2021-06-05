package cat.itb.martamacias7e4.dam.m03.uf2.recursivity;

import java.util.Scanner;

public class MultiplicationRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int multiply = getMultiplication(x, y);
        System.out.println(multiply);
    }
    public static int getMultiplication(int x, int y){
        if (y==0){
            return 0;
        }
        return x + getMultiplication(x,y-1);
    }
}
