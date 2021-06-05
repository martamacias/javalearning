package cat.itb.martamacias7e4.dam.m03.uf4.exercices.teams;

public class Team {
    String name;
    String motto;

    public Team(String name, String motto) {
        this.name = name;
        this.motto = motto;
    }

    public void shoutMotto(){
        System.out.println(motto);
    }
}
