package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class ExamGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu la teva nota");
        double nota = scanner.nextDouble();

        if ((nota>10) || (nota<0)){
            System.out.println("Nota invàlida");
        }else if (nota>=9){
            System.out.println("Excel·lent");
        }else if ((nota<9) && (nota>=7)){
            System.out.println("Notable");
        }else if ((nota<7) && (nota>=6)){
            System.out.println("Bé");
        }else if ((nota<6) && (nota>=5)){
            System.out.println("Suficient");
        }else if ((nota<5) && (nota>=0)){
            System.out.println("Suspès");
        }
    }
}
