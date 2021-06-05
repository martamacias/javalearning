package cat.itb.martamacias7e4.dam.m03.uf3.exercices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RadarFile {
    public static void main(String[] args) throws IOException {
        Scanner general = new Scanner(System.in);
        String userPath = general.nextLine();
        File file = new File(userPath);

        getMax(file);
        int maxVel = getMax(file);
        System.out.println("Velocitat màxima: "+maxVel+"km/h");
        int minVel= getMin(file);
        System.out.println("Velocitat mínima: "+minVel+"km/h");
        int avg = getAvg(file);
        System.out.println("Velocitat mitjana: "+avg+"km/h");
    }

    private static int getMax(File file) throws FileNotFoundException {
        Scanner scanFile = new Scanner(file);
        int maxVel = 0;
        while (scanFile.hasNext()){
            int veloc = scanFile.nextInt();
            if (maxVel<veloc){
                maxVel = veloc;
            }
        }
        return maxVel;
    }

    private static int getAvg(File file) throws FileNotFoundException {
        Scanner scanFile = new Scanner(file);
        int suma = 0;
        int numbers = 0;
        while (scanFile.hasNext()){
            int veloc = scanFile.nextInt();
            suma += veloc;
            numbers ++;
        }
        return suma / numbers;
    }

    private static int getMin(File file) throws FileNotFoundException {
        Scanner scanFile = new Scanner(file);
        int minVel = 100000;
        while (scanFile.hasNext()){
            int veloc = scanFile.nextInt();
            if (minVel>veloc){
                minVel = veloc;
            }
        }
        return minVel;
    }
}
/*
Un radar de transit va guardant les diferents velocitats que registra en un fitxer. Guarda les velocitats en km/hora, separades per un espai. Et pots descarregar un exemple de fitxer aquí

Fes un programa demani a l'usuai la ruta del fitxer i  que calculi la velocitat màxima, mitjana i mínima detectada.

Input
/home/sjo/radar.txt

Output
Velocitat màxima: 100km/h
Velocitat mínima: 50km/h
Velocitat mitjana: 75km/h

Path: C:\Users\macia\OneDrive\Escriptori\hola\velocitats.txt
 */