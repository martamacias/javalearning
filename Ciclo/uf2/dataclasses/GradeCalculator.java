package cat.itb.martamacias7e4.dam.m03.uf2.dataclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // llegir estudiants
        List<Grade> studentGrades = readStudentGrades(scanner);
        printAvgGrade(studentGrades);
//        // impirmir estudiants
//
//        int quant = scanner.nextInt();
//        int i = 0;
//        while (i<quant) {
//            String name = Grade.getName(scanner);
//            double grade = Grade.calculateGrade(scanner);
//            Grade.printGrade(name, grade);
//            i++;
//        }
    }

    public static void printAvgGrade(List<Grade> studentGrades) {
        for (Grade grade: studentGrades){
            printGrade(grade);
        }
    }

    public static void printGrade(Grade grade) {
        String name = grade.getName();
        double avgGrade = grade.getAvgGrade();
        System.out.printf("%s: %.1f%n", name, avgGrade);
    }


    public static List<Grade> readStudentGrades(Scanner scanner) {
        int size = scanner.nextInt();
        List<Grade> result = new ArrayList<>();
        for(int i=0;i<size;++i){
            Grade grade = readStudentGrade(scanner);
            result.add(grade);
        }
        return result;
    }

    public static Grade readStudentGrade(Scanner scanner) {
        String name = scanner.next();
        double notaExercicis = scanner.nextDouble();
        double notaExamen = scanner.nextDouble();
        double notaProjecte = scanner.nextDouble();
        return new Grade(name, notaExercicis, notaExamen, notaProjecte);
    }
}
/*3
Ot 8,2 4,5 6,1
Mar 9,5 8,7 6,4
Ona 2,3 3,4 2,1*/