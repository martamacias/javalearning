package cat.itb.martamacias7e4.dam.m03.uf4.exercices.plant;

public class PlantWaterSystemApp {
    public static void main(String[] args) {
        PlantWaterMock plantWaterMock = new PlantWaterMock();
        PlantWaterControler plantWaterControler = new PlantWaterControler(plantWaterMock);
        plantWaterControler.waterIfNeeded();
    }
}
