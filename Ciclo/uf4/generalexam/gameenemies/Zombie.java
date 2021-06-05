package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.gameenemies;

public class Zombie extends Enemies{
    String so;

    public Zombie(String name, int vida, String so) {
        super(name, vida);
        this.so = so;
    }

    @Override
    public void attack(int strenght) {
        if (vida > 0) {
            vida -= strenght;
            System.out.println(so);
            System.out.printf("L'enemic %s té %d punts de vida després d'un atac de força %d%n", name, Math.max(vida, 0), strenght);
        }
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", vida=" + vida +
                ", so='" + so + '\'' +
                '}';
    }
}
