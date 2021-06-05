package cat.itb.martamacias7e4.dam.m03.uf4.exercices.plant;

import java.util.List;

public class PlantWaterControler {
    PlantWater plantWater;
    public PlantWaterControler(PlantWater plantWater){
        this.plantWater = plantWater;
    }
    public void waterIfNeeded(){
        if (waterIsNeeded())
            plantWater.startWatterSystem();
    }

    public boolean waterIsNeeded(){
        List<Double> list = plantWater.getHumidityRecord();
        double average = average(list);
        return average<2;
    }

    private double average(List<Double> list) {
        return suma(list)/list.size();
    }

    private double suma(List<Double> list) {
        double suma = 0;
        for (Double value: list){
            suma += value;
        }
        return suma;
    }
}
