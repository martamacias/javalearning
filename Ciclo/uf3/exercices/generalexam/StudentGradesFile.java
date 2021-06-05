package cat.itb.martamacias7e4.dam.m03.uf3.exercices.generalexam;

import cat.itb.martamacias7e4.dam.m03.uf2.dataclasses.Grade;
import cat.itb.martamacias7e4.dam.m03.uf2.dataclasses.GradeCalculator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class StudentGradesFile {
    public static void main(String[] args) throws IOException {
        Scanner general = new Scanner(System.in);
        String user = general.nextLine();
        Path userPath = Paths.get(user);

        Scanner scanner = new Scanner(userPath);
        List<Grade> studentGrades = GradeCalculator.readStudentGrades(scanner);
        System.out.println("----- Estudiants -----");
        GradeCalculator.printAvgGrade(studentGrades);
        System.out.println("----- Resum -----");
        printStatics(studentGrades);
    }

    private static void printStatics(List<Grade> studentGrades) {
        int aprovats = 0;
        int suspesos = 0;
        for (Grade grade: studentGrades){
            double avg = grade.getAvgGrade();
            if (avg>=5){
                aprovats++;
            }else {
                suspesos++;
            }
        }
        System.out.printf("Aprovats: %d %nSuspesos: %d", aprovats, suspesos);
    }
}