package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Comparable<Vehicle>{
    String name;
    VehicleBrand brand;

    public Vehicle(String name, VehicleBrand brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", brand=" + brand +
                '}';
    }


    @Override
    public int compareTo(Vehicle vehicle) {
        return this.name.compareTo(vehicle.name);
    }
}
