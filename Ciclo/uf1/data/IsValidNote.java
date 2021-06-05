package cat.itb.martamacias7e4.dam.m03.uf1.data;

import java.util.Scanner;

public class IsValidNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();

        boolean is5Note = number == 5;
        boolean is10Note = number == 10;
        boolean is20Note = number == 20;
        boolean is50Note = number == 50;
        boolean is100Note = number == 100;
        boolean is200Note = number == 200;
        boolean is500Note = number == 500;


        boolean isValidNote = is5Note || is10Note || is20Note || is50Note || is100Note || is200Note || is500Note;

        System.out.println(isValidNote);
    }
}
