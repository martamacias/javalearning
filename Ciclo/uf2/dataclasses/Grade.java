package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.Scanner;

public class Grade {
    String name;
    double notaExercicis;
    double notaExamen;
    double notaProjecte;

    public Grade(String name, double notaExercicis, double notaExamen, double notaProjecte) {
        this.name = name;
        this.notaExercicis = notaExercicis;
        this.notaExamen = notaExamen;
        this.notaProjecte = notaProjecte;
    }

    public String getName() {
        return name;
    }

    public double getNotaExercicis() {
        return notaExercicis;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public double getNotaProjecte() {
        return notaProjecte;
    }

    public double getAvgGrade(){
        return notaExercicis*0.3+notaExamen*0.3+notaProjecte*0.4;
    }

}
