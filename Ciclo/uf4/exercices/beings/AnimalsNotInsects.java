package cat.itb.martamacias7e4.dam.m03.uf4.exercices.beings;

import java.time.LocalDateTime;

public class AnimalsNotInsects extends AnimalsInsects{
    boolean heart;

    public AnimalsNotInsects(String name, String type, LocalDateTime birth, boolean cerebralActivity, boolean heart) {
        super(name, type, birth, cerebralActivity);
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "AnimalsNotInsects{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birth=" + birth +
                ", cerebralActivity=" + cerebralActivity +
                ", heart=" + heart +
                '}';
    }
}
