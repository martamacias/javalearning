package cat.itb.martamacias7e4.dam.m03.uf1.seleccio;

import java.util.Scanner;

public class NextSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriu hores, minuts i segons");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();

        if(second!=59){
            second++;
        } else {
            second = 0;
            if(minute!=59){
                minute++;
            } else {
                minute = 0;
                if(hour != 23){
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }

        String hourString = timeToString(hour);
        String minuteString = timeToString(minute);
        String secondString = timeToString(second);

        // print next second
        System.out.println(hourString + ":" + minuteString + ":" + secondString);
    }

    private static String timeToString(int time) {
        if(time<10)
            return "0"+time;
        else
            return time + "";
    }
}
