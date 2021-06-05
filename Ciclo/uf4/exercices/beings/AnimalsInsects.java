package cat.itb.martamacias7e4.dam.m03.uf4.exercices.beings;

import java.time.LocalDateTime;

public class AnimalsInsects extends AliveBeings{
    boolean cerebralActivity;

    public AnimalsInsects(String name, String type, LocalDateTime birth, boolean cerebralActivity) {
        super(name, type, birth);
        this.cerebralActivity = cerebralActivity;
    }

    @Override
    public String toString() {
        return "AnimalsInsects{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birth=" + birth +
                ", cerebralActivity=" + cerebralActivity +
                '}';
    }
}
