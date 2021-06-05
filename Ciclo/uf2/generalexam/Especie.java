package cat.itb.martamacias7e4.dam.m03.uf2.generalexam;

import java.util.Scanner;

public class Especie {
    String cientific;
    String comu;
    int total;

    public Especie(String cientific, String comu, int total) {
        this.cientific = cientific;
        this.comu = comu;
        this.total = total;
    }
    public int getTotal(){
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCientific() {
        return cientific;
    }
    public String getComu() {
        return comu;
    }
    public static Especie readEspecie(Scanner scanner){
        String cientific = scanner.nextLine();
        String comu = scanner.nextLine();
        int total = 0;
        return new Especie(cientific, comu, total);
    }
}
