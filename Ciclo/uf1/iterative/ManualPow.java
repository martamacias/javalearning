package cat.itb.martamacias7e4.dam.m03.uf1.iterative;

import java.util.Scanner;

public class ManualPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b==2) {
            int math = a * a;
            System.out.println(math);
        }else if (b>2){
            int math = a * a;
            int i = 0;
            while (i < b) {
                int result = math * a;
                i++;
                if (i == b) {
                    System.out.println(result);
                }
            }
        }else{
            System.out.println(a);
        }
    }
}
