package cat.itb.martamacias7e4.dam.m03.uf4.generalexam.gameenemies;

import java.util.ArrayList;
import java.util.List;

public class GameEnemiesApp {
    public static void main(String[] args) {
        List<Enemies> enemies = new ArrayList<>();
        Zombie zombie1 = new Zombie("Zog", 10, "AARRRrrgg");
        enemies.add(zombie1);
        Zombie zombie2 = new Zombie("Lili", 30, "GRAaaArg");
        enemies.add(zombie2);
        Troll troll1 = new Troll("Jum", 12, 5);
        enemies.add(troll1);
        Goblin goblin1 = new Goblin("Tim", 60);
        enemies.add(goblin1);

        enemies.get(0).attack(5);
        enemies.get(0).attack(7);
        enemies.get(3).attack(7);
        enemies.get(1).attack(3);
        enemies.get(2).attack(4);
        enemies.get(2).attack(8);
        enemies.get(1).attack(4);
        enemies.get(0).attack(5);
        enemies.get(0).attack(1);
        enemies.get(2).attack(1);
        enemies.get(2).attack(1);
        enemies.get(2).attack(1);

        System.out.println(enemies.toString());
    }
}
