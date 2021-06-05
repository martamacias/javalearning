package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reserva {
    int people;
    String nom;

    public Reserva(int people, String nom){
        this.people = people;
        this.nom =nom;
    }

    public String getNom() {
        return nom;
    }

    public int getPeople() {
        return people;
    }
    /**
     * Read people and nom from scanner
     * @param scanner
     * @return Reserva
     */
    public static Reserva readRes(Scanner scanner) {
        int people = scanner.nextInt();
        String nom = scanner.next();
        Reserva reserva = new Reserva(people, nom);
        return reserva;
    }

    /**
     * Print the number of parcels available and total people
     * @param parcel
     * @param total
     */
    public static void printCamp(int parcel, int total) {
        System.out.println("parcel·les: "+parcel);
        System.out.println("persones: "+total);
    }

}
