package cat.itb.martamacias7e4.dam.m03.uf1.staticfunctions;

import java.util.Scanner;

public class IntRectangleAreaFunc {
    public static int rectangleArea (int lenght, int width){
        return lenght*width;
    }
    public static void main(String[] args) {
        // ask a user 2 integer
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        int area = rectangleArea(length,width);
        System.out.println(area);
    }
}
