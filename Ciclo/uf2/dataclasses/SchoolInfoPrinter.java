package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.Scanner;

public class SchoolInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = School.readSchool(scanner);
        School.printSchool(school);
    }
}
/*
Institut Tecnològic de Barcelona
c/ aiguablava 121
08033
Barcelona

 */
