package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.Scanner;

public class CarPlate {
    String plate;
    String model;
    String color;

    public CarPlate(String plate, String model, String color) {
        this.plate = plate;
        this.model = model;
        this.color = color;
    }

    public static CarPlate readCar(Scanner scanner) {
        String plate = scanner.next();
        String model = scanner.next();
        String color = scanner.next();
        return new CarPlate(plate, model, color);
    }

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", plate, model, color);
    }
}
