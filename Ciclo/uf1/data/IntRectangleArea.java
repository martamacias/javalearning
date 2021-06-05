package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IntRectangleArea {
    public static void main(String[] args) {
        // ask a user 2 integer
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        int area = length*width;
        //
        System.out.println(area);
    }
}
