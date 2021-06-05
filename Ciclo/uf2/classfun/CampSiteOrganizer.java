package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampSiteOrganizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Llista de reserves
        List<Reserva> reservas = new ArrayList<>();

        //Escriure ENTRA, MARXA O END
        System.out.print("> ");
        String start = scanner.next();

        //Iniciar el número de parcel·les disponibles i el número de persones al camping
        int parcel = 0;
        int total = 0;
        //Bucle fins END
        while (!start.equals("END")){
            if (start.equals("ENTRA")){
                Reserva reserva = Reserva.readRes(scanner);
                reservas.add(reserva); //Add to List reservas
                parcel ++;
                total += reserva.people;
                Reserva.printCamp(parcel, total);
            }else if (start.equals("MARXA")){
                parcel --;
                String name = scanner.next();
                for (Reserva reserva: reservas){ //Busca el nom en la llista de reserves
                    if (reserva.nom.equals(name)){
                        total-= reserva.people;
                    }
                }
                Reserva.printCamp(parcel, total);
            }
            System.out.print("> ");
            start = scanner.next();
        }
    }
}
/*
> ENTRA 2 Maria
parcel·les: 1
persones: 2
> ENTRA 5 Mar
parcel·les: 2
persones: 7
> MARXA Maria
parcel·les: 1
persones: 5
> END

 */