package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.gameenemies;

public class Troll extends Enemies{
    int resistencia;

    public Troll(String name, int vida, int resistencia) {
        super(name, vida);
        this.resistencia = resistencia;
    }

    @Override
    public void attack(int strenght) {
        if (vida>0){
            if (resistencia<strenght){
                vida -= strenght;
            }
            System.out.printf("L'enemic %s té %d punts de vida després d'un atac de força %d%n", name, Math.max(vida, 0), strenght);
        }
    }

    @Override
    public String toString() {
        return "Troll{" +
                "name='" + name + '\'' +
                ", vida=" + vida +
                ", resistencia=" + resistencia +
                '}';
    }
}
