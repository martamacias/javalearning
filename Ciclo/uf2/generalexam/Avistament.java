package cat.itb.martamacias7e4.dam.m03.uf2.generalexam;

import java.util.Scanner;

public class Avistament {
    int position;
    int quant;

    public Avistament(int position, int quant) {
        this.position = position;
        this.quant = quant;
    }

    public int getPosition() {
        return position;
    }

    public int getQuant() {
        return quant;
    }
    public static Avistament readAvist(Scanner scanner){
        int position = scanner.nextInt();
        int quant = scanner.nextInt();
        return new Avistament(position, quant);
    }
}
