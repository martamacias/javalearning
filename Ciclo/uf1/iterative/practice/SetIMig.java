package cat.itb.martamacias7e4.dam.m03.uf1.iterative.practice;
//pràctica set i mig
import java.util.Scanner;

public class SetIMig {
    public static void main(String[] args) {
        double userCounter = playUserTurn();
        if (userCounter<=7.5)
            playComputerTurn(userCounter);

    }
    public static double getCardValue(int card) {
        if (card >= 1 && card <= 7) {
            return card;
        } else if (card > 7 && card <= 10) {
            return 0.5;
        }
        return 0;
    }
    public static String getCardText(int card) {

        switch (card) {
            case 8:
                return "sota";
            case 9:
                return "cavall";
            case 10:
                return "rei";
            default:
                return card+"";
        }
    }
    public static double playUserTurn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vols començar a jugar?");
        int play = scanner.nextInt();
        double userCounter=0;
        double counter = 0;

        while (play == 1 && userCounter<=7.5) {
            int card = ItbRandomizer.nextInt(9) + 1;
            System.out.println("T'ha sortit la carta: " + getCardText(card));
            userCounter = counter += getCardValue(card);
            System.out.println("Resultat actual: " + userCounter);
            if (userCounter<=7.5) {
                System.out.println("Vols seguir jugant?");
                play = scanner.nextInt();
            }else {
                System.out.println("T'has passat.");

            }
        }
        return userCounter;
    }
    public static void playComputerTurn(double userCounter){
        double compCounter=0;
        double counter = 0;
        while (compCounter<7.5 && compCounter < userCounter){
            int card = ItbRandomizer.nextInt(9) + 1;
            System.out.println("L'ordinador ha tret un: " + getCardText(card));
            compCounter = counter += getCardValue(card);
            System.out.println("Resultat actual: " + compCounter);
        }
        if (compCounter<=7.5) {
            System.out.println("Ha guanyat l'ordinador");
        }else {
            System.out.println("L'ordinador s'ha passat.");
            System.out.println("Has guanyat!");
        }
    }
}

