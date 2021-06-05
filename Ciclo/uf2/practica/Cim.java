package cat.itb.martamacias7e4.dam.m03.uf2.practica;

public class Cim {
    String name;
    int height;
    String country;
    double distance;
    double time;

    public Cim(String name, int height, String country, double distance, double time){
        this.name = name;
        this.height = height;
        this.country = country;
        this.distance = distance;
        this.time = time;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public String getCountry() {
        return country;
    }
    public double getDistance() {
        return distance;
    }
    public double getTime() {
        return time;
    }


}
/*
nom del cim, alçada (metres), país, distància (metres), temps(en minuts)
 */