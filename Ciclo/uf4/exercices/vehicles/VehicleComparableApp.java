package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleComparableApp{
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        VehicleBrand vehicleBrand = new VehicleBrand("lorem", "Togo");
        Bicycle bicycle = new Bicycle("modelX", vehicleBrand, 5);
        Bicycle bicycle2 = new Bicycle("modelA", vehicleBrand, 5);
        Bicycle bicycle3 = new Bicycle("modelB", vehicleBrand, 5);
        Scooter scooter = new Scooter("s562", vehicleBrand, 45.3);
        vehicles.add(bicycle);
        vehicles.add(scooter);
        vehicles.add(bicycle2);
        vehicles.add(bicycle3);
        Collections.sort(vehicles);
        System.out.println(vehicles);
    }
}
