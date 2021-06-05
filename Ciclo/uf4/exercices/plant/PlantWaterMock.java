package cat.itb.martamacias7e4.dam.m03.uf4.exercices.plant;

import java.util.ArrayList;
import java.util.List;

public class PlantWaterMock implements PlantWater{
    @Override
    public List<Double> getHumidityRecord() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(1.7);
        list.add(1.5);
        list.add(1.6);
        list.add(1.6);
        list.add(1.8);
        list.add(1.2);
        return list;
    }

    @Override
    public void startWatterSystem() {
        System.out.println("WATER!!");
    }
}
