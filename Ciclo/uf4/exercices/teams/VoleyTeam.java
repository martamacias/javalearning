package cat.itb.martamacias7e4.dam.m03.uf4.exercices.teams;

public class VoleyTeam extends Team{
    String color;

    public VoleyTeam(String name, String motto, String color) {
        super(name, motto);
        this.color = color;
    }

    @Override
    public void shoutMotto(){
        System.out.println(color);
        System.out.println(motto);
    }
}
