package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.*;

public class StudentInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qEscola = scanner.nextInt();//quantitat d'escoles
        scanner.nextLine();
        ArrayList<School> schools = new ArrayList<>();

        int i = 0;//bucle matriu
        while (i<qEscola) {
            School school = School.readSchool(scanner);
            schools.add(school);
            i++;
        }
        //School.printSchool(schools.get(0));

        int qAlums = scanner.nextInt();//quantitat d'alumnes


        int k = 0;
        while (k<qAlums){
            int position = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            School.printSchool(schools.get(position));
            System.out.println(name);
            System.out.println("--------------------");
            k++;
        }
    }

}
/*
2
Institut Tecnològic de Barcelona
c/ aiguablava 121
08033
Barcelona
Institut Escola Trinitat Nova
C/ de la Pedrosa, 2
08033
Barcelona
4
0
Mar Pi
1
Ona Om
1
Ot Puig
1
Iu Rei

 */