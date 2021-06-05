package cat.itb.martamacias7e4.dam.m03.uf1.mix;

import java.util.Scanner;

public class HomeworkHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        while (dividend!=-1){
            int divisor = scanner.nextInt();
            int quocient = scanner.nextInt();
            int residu = scanner.nextInt();

            boolean quo = dividend/divisor==quocient;
            boolean res = dividend%divisor==residu;
            if (quo & res){
                System.out.println("correcte");
            }else {
                System.out.println("error");
            }
            dividend = scanner.nextInt();
        }

    }
}
//es digitalitza el Dividend, el Divisor, el Quocient i el Residu
//El programa haurà de dir quines divisions són incorrectes i quines correctes