package cat.itb.martamacias7e4.dam.m03.uf4.exercices.teams;

public class BasketTeam extends Team{
    public BasketTeam(String name, String motto) {
        super(name, motto);
    }
    @Override
    public void shoutMotto(){
        System.out.println("1,2,3");
        System.out.println(motto);
    }
}
