import Abilities.Ability;
import Abilities.AbilityType;
import AllyClasses.Ally;
import AllyClasses.Cleric;
import AllyClasses.Fighter;
import AllyClasses.Wizard;
import EnemyClasses.Enemy;
import EnemyClasses.EnemyType;
import Game.Game;
import Game.Room;
import Items.*;
import org.junit.Before;

import java.util.ArrayList;

public class TestSetup {

    protected Fighter fighter1;
    protected Cleric cleric1;
    protected Weapon medsword;
    protected Wand goodwand;
    protected Staff staff1;
    protected Enemy skeleton1;
    protected Wizard wizard1;
    protected Pet pet1;
    protected Game game1;
    protected ArrayList<Ally> allies;
    protected Room room1;
    protected ArrayList<Enemy> enemies;
    protected Ability swingweapon1;

    @Before
    public void setUp(){
        fighter1 = new Fighter("harry");
        wizard1 = new Wizard("gordon");
        cleric1 = new Cleric("cedric");
        staff1 = new Staff(StaffType.GREATSTAFF);
        pet1 = new Pet("harold");
        medsword = new Weapon(WeaponType.MEDIUMSWORD);
        goodwand = new Wand(WandType.GOOD);
        skeleton1 = new Enemy(EnemyType.SKELETON);
        allies = new ArrayList<Ally>();
        allies.add(fighter1);
        allies.add(wizard1);
        allies.add(cleric1);
        swingweapon1 = new Ability(AbilityType.SWINGWEAPON);
        game1 = new Game(allies);

        enemies= new ArrayList<Enemy>();
        enemies.add(new Enemy(EnemyType.SKELETON));
        enemies.add(new Enemy(EnemyType.SKELETON));
        enemies.add(new Enemy(EnemyType.SKELETON));

        room1 = new Room(enemies,"Test Room");

    }
}
