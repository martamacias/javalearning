package cat.itb.martamacias7e4.dam.m03.uf4.exercices.teams;

public class GolfPlayer extends Team{
    String playerName;

    public GolfPlayer(String name, String motto, String playerName) {
        super(name, motto);
        this.playerName = playerName;
    }
    @Override
    public void shoutMotto(){
        System.out.println(playerName);
        System.out.println(motto);
    }
}
