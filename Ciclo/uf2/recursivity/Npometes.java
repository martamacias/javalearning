package cat.itb.martamacias7e4.dam.m03.uf2.recursivity;

import java.util.Scanner;

public class Npometes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int applesCount = scanner.nextInt();
        String song = getAppleSong(applesCount);
        System.out.println(song);
    }

    public static String getAppleSongStanza(int applesCount) {
        return String.format("%1$d pometes té el pomer,%nde %1$d una, de %1$d una,%n" +
                "%1$d pometes té el pomer,%nde %1$d una en caigué.%nSi mireu el vent d'on vé%n" +
                "veureu el pomer com dansa,%nsi mireu el vent d'on vé%n" +
                "veureu com dansa el pomer.%n%n", applesCount);
    }
    public static String getAppleSong(int applesCount){
        if (applesCount == 0){
            return "";
        }
        return getAppleSongStanza(applesCount) + getAppleSong(applesCount - 1);
    }
}
