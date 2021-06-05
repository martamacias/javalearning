package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class HowManyDaysInMonth {
    public static void main(String[] args) {
        // Demanar un dia del mes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu el número del mes.");
        int mes = scanner.nextInt();

        String text;
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                text = "El mes té 31 dies";
                break;
            case 2:
                text = "El mes té 28 dies";
                break;
            default:
                text = "El mes té 30 dies";
        }
        System.out.println(text);

        //Abans del switch:
        //if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
        //{
            //System.out.println("El mes " + mes + " té 31 díes");
        //}else if (mes == 2) {
            //System.out.println("El mes " + mes + " té 28 díes");
        //}else{
            //System.out.println("El mes " + mes + " té 30 díes");
    }
}
