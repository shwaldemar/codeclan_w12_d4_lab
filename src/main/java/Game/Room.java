package Game;

import EnemyClasses.Enemy;
import Items.ArmourType;

import java.util.ArrayList;

public class Room {
    private ArrayList<Enemy> enemies;
    //private Loot<ArmourType> loot;
    private String name;

    public Room(ArrayList<Enemy> enemies, String name) {
        this.enemies = enemies;
        this.name = name;
    }

    public int numberOfEnemiesLeft(){
        return enemies.size();
    }

    public boolean noMoreEnemies(){
        if (numberOfEnemiesLeft() == 0)
            return true;
        return false;
    }


}
