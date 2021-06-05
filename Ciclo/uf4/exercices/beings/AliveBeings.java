package cat.itb.martamacias7e4.dam.m03.uf4.exercices.beings;


import java.time.LocalDateTime;

public class AliveBeings {
    String name;
    String type;
    LocalDateTime birth;

    public AliveBeings(String name, String type, LocalDateTime birth) {
        this.name = name;
        this.type = type;
        this.birth = birth;
    }

    public String toString() {
        return "AliveBeings{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birth=" + birth +
                '}';
    }
}
