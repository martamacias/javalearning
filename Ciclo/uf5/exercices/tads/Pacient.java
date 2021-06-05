package cat.itb.martamacias7e4.dam.m03.uf5.exercices.tads;

public class Pacient {
    int prior;
    String nom;

    public Pacient(int prior, String nom) {
        this.prior = prior;
        this.nom = nom;
    }

    public int getPrior() {
        return prior;
    }

    public String getNom() {
        return nom;
    }
}
