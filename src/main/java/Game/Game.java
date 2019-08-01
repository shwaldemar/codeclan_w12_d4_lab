package Game;

import AllyClasses.Ally;
import EnemyClasses.Enemy;
import EnemyClasses.EnemyType;

import java.util.ArrayList;

public class Game {
    private ArrayList<Room> rooms;
    private ArrayList<Ally> allies;
    private PhaseType phase;


    public Game(ArrayList<Ally> allies) {
        this.allies = allies;
        this.phase = PhaseType.COMBAT;

        ArrayList<Enemy> enemies1 = new ArrayList<Enemy>();
        enemies1.add(new Enemy(EnemyType.SKELETON));
        enemies1.add(new Enemy(EnemyType.SKELETON));
        enemies1.add(new Enemy(EnemyType.SKELETON));

        ArrayList<Enemy> enemies2 = new ArrayList<Enemy>();
        enemies2.add(new Enemy(EnemyType.SKELETON));
        enemies2.add(new Enemy(EnemyType.OGRE));
        enemies2.add(new Enemy(EnemyType.SKELETON));

        ArrayList<Enemy> enemies3 = new ArrayList<Enemy>();
        enemies3.add(new Enemy(EnemyType.SKELETON));
        enemies3.add(new Enemy(EnemyType.OGRE));
        enemies3.add(new Enemy(EnemyType.DRAGON));

        Room room1 = new Room(enemies1,"Creepy dungeon");
        Room room2 = new Room(enemies2,"Creepier dungeon");
        Room room3 = new Room(enemies3,"Creepiest dungeon");

        this.rooms = new ArrayList<Room>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
    }

    public int getNumberOfAllies(){
        return allies.size();
    }

    public int getNumberOfRooms(){
        return rooms.size();
    }

}
