package cat.itb.martamacias7e4.dam.m03.uf4.exercices.teams;

import java.util.ArrayList;
import java.util.List;

public class TeamMotto {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        Team team1 = new Team("Mosques", "Bzzzanyarem");
        teams.add(team1);
        Team team2 = new Team("Dragons", "Grooarg");
        teams.add(team2);
        Team team3 = new Team("Abelles", "Piquem Fort");
        teams.add(team3);
        shoutMottos(teams);
    }
    public static void shoutMottos(List<Team> teams){
        for(Team team: teams)
            team.shoutMotto();
    }
}
