package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarByPlateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, CarPlate> cars = getMapCars(scanner);
        getCarWithPlate(cars, scanner);
    }

    private static void getCarWithPlate(Map<String, CarPlate> cars, Scanner scanner) {
        String plate = scanner.next();
        while (!plate.equals("END")){
            CarPlate car = cars.get(plate);
            System.out.println(car.toString());
            plate = scanner.next();
        }
    }

    private static Map<String, CarPlate> getMapCars(Scanner scanner) {
        Map<String, CarPlate> cars = new HashMap<>();
        int quant = scanner.nextInt();
        for (int i = 0; i < quant; i++) {
            CarPlate car = CarPlate.readCar(scanner);
            String plate = car.getPlate();
            cars.put(plate, car);
        }
        return cars;
    }
}
/*
Un concesionari de contxes de segona ma vol tenir la informació dels cotxes que te en estoc.
De cada cotxe s'en guarda la matricula, el model i el color.

Vol poder accedir rapidament a la informació del cotxe usant la matricula.

Input
3
2322UUY Opel Blanc
4738URP Seat Groc
3798YHT Opel Verd
4738URP
3798YHT
END

Output
4738URP Seat Groc
3798YHT Opel Verd
 */