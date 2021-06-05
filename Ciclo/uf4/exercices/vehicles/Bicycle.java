package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

public class Bicycle extends Vehicle{
    int gears;

    public Bicycle(String name, VehicleBrand brand, int gears) {
        super(name, brand);
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "name='" + name +
                ", gears=" + gears + '\'' +
                ", brand=" + brand +
                '}';
    }
}
