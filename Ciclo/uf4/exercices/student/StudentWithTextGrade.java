package cat.itb.martamacias7e4.dam.m03.uf4.exercices.student;

public class StudentWithTextGrade {
    public static void main(String[] args) {
        Student student = new Student("Mar", Grade.FAILED);
        System.out.println(student);
        Student student1 = new Student("Joan", Grade.EXCELLENT);
        System.out.println(student1);
    }
}
