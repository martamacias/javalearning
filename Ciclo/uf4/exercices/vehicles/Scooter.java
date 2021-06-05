package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

public class Scooter extends Vehicle{
    double power;

    public Scooter(String name, VehicleBrand brand, double power) {
        super(name, brand);
        this.power = power;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "name='" + name +
                ", power=" + power +  '\'' +
                ", brand=" + brand +
                '}';
    }
}
