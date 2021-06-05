package cat.itb.martamacias7e4.dam.m03.uf4.exercices.beings;

import java.time.LocalDateTime;

public class Tree extends AliveBeings{
    boolean dry;

    public Tree(String name, String type, LocalDateTime birth, boolean dry) {
        super(name, type, birth);
        this.dry = dry;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birth=" + birth +
                ", dry=" + dry +
                '}';
    }
}
