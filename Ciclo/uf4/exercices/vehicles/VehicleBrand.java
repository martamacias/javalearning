package cat.itb.martamacias7e4.dam.m03.uf4.exercices.vehicles;

public class VehicleBrand {
    String name;
    String country;

    public VehicleBrand(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "VehicleBrand{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
