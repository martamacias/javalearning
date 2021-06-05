package cat.itb.martamacias7e4.dam.m03.uf4.exercices.teams;

import java.util.ArrayList;
import java.util.List;

public class SportTeamMotto {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        BasketTeam basketTeam = new BasketTeam("Mosques", "Bzzzanyarem");
        teams.add(basketTeam);
        VoleyTeam voleyTeam = new VoleyTeam("Dragons", "Grooarg", "verd");
        teams.add(voleyTeam);
        GolfPlayer golfPlayer = new GolfPlayer("Abelles", "Piquem Fort", "Marta Ahuja");
        teams.add(golfPlayer);
        shoutMottos(teams);
    }
    public static void shoutMottos(List<Team> teams){
        for(Team team: teams)
            team.shoutMotto();
    }
}
