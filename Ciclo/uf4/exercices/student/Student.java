package cat.itb.martamacias7e4.dam.m03.uf4.exercices.student;

public class Student {
    String name;
    Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
