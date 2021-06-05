package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

public class Car {
    String model;
    String color;
    String matricula;

    public Car(String model, String color, String matricula) {
        this.model = model;
        this.color = color;
        this.matricula = matricula;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", model, color);
    }
}
