package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarExercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Car> cars = new HashMap<>();
        Car car1 = new Car("Renault", "red", "AW1456L");
        Car car2 = new Car("Audi", "black", "WR36798");
        cars.put(car1.matricula, car1);
        cars.put(car2.matricula, car2);

        String matric = scanner.nextLine();
        while (!matric.equals("END")){
            Car car = cars.get(matric);
            System.out.println(car.toString());
            matric = scanner.nextLine();
        }
    }
}
