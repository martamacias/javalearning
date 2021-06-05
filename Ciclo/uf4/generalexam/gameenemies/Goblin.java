package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.gameenemies;

public class Goblin extends Enemies{
    public Goblin(String name, int vida) {
        super(name, vida);
    }

    @Override
    public void attack(int strenght) {
        if (vida>0){
            if (strenght<4){
                vida -=1;
            }else if (strenght>4){
                vida -=5;
            }
            System.out.printf("L'enemic %s té %d punts de vida després d'un atac de força %d%n", name, Math.max(vida, 0), strenght);
        }
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "name='" + name + '\'' +
                ", vida=" + vida +
                '}';
    }
}
