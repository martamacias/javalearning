package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class IdentikitGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demanar descripció
        System.out.println("Introdueix el tipus de cabell (arrissats, llisos o pentinats)");
        String hair = scanner.nextLine();
        System.out.println("Introdueix el tipus de ulls (aclucats, rodons o estrellats)");
        String eyes = scanner.nextLine();
        System.out.println("Introdueix el tipus de nas (aixafat, arromangat o aguilenc)");
        String nose = scanner.nextLine();
        System.out.println("Introdueix el tipus de boca (normal, bigoti o dents");
        String mouth = scanner.nextLine();

        // Passar les descripcions a símbols o parts del robot
        String hairType;
        switch (hair){
            case "arrissats":
                hairType = "@@@@@";
                break;
            case "llisos":
                hairType = "VVVVV";
                break;
            case "pentinats":
                hairType = "XXXXX";
                break;
            default:
                hairType = "No encontrado";
                break;
        }

        String eyesType;
        switch (eyes){
            case "aclucats":
                eyesType =".-.-.";
                break;
            case "rodons":
                eyesType = ".o-o.";
                break;
            case "estrellats":
                eyesType = ".*-*.";
                break;
            default:
                eyesType = "No encontrado";
                break;
        }

        String noseType;
        switch (nose){
            case "aixafat":
                noseType = "..0..";
                break;
            case "arromangat":
                noseType = "..C..";
                break;
            case "aguilenc":
                noseType = "..V..";
                break;
            default:
                noseType = "No encontrado";
                break;
        }

        String mouthType;
        switch (mouth){
            case "normal":
                mouthType = ".===.";
                break;
            case "bigoti":
                mouthType = ".∼∼∼.";
                break;
            case "dents":
                mouthType = ".www.";
                break;
            default:
                mouthType = "No encontrado";
                break;
        }

        System.out.println(hairType);
        System.out.println(eyesType);
        System.out.println(noseType);
        System.out.println(mouthType);
    }
}
