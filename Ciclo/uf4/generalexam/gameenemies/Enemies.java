package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.gameenemies;

public abstract class Enemies {
    String name;
    int vida;

    public Enemies(String name, int vida) {
        this.name = name;
        this.vida = vida;
    }
    public abstract void attack(int strenght);

    @Override
    public String toString() {
        return "Enemies{" +
                "name='" + name + '\'' +
                ", vida=" + vida +
                '}';
    }
}
