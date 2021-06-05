package cat.itb.martamacias7e4.dam.m03.uf1.strings;

import java.util.Scanner;

public class SameEmailId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correu1 = scanner.next();
        String correu2 = scanner.next();

        String correu11 = correu1.replaceAll("\\.","");
        String correu22 = correu2.replaceAll("\\.","");

        boolean x = correu11.equalsIgnoreCase(correu22);
        System.out.println(x);
    }
}
/*L'usuari introduirà dos correus
Imprimeix true o false segons si són el mateix correu o no
input

marom@example.com
m.A.r.o.m@example.com
output: true*/