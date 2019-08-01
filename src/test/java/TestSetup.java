import AllyClasses.Cleric;
import AllyClasses.Fighter;
import AllyClasses.Wizard;
import EnemyClasses.Enemy;
import EnemyClasses.EnemyType;
import Items.*;
import org.junit.Before;

public class TestSetup {

    protected Fighter fighter1;
    protected Cleric cleric1;
    protected Weapon medsword;
    protected Wand goodwand;
    protected Staff staff1;
    protected Enemy skeleton1;
    protected Wizard wizard1;

    @Before
    public void setUp(){
        fighter1 = new Fighter("harry");
        wizard1 = new Wizard("gordon");
        cleric1 = new Cleric("cedric");
        staff1 = new Staff(StaffType.GREATSTAFF);
        medsword = new Weapon(WeaponType.MEDIUMSWORD);
        goodwand = new Wand(WandType.GOOD);
        skeleton1 = new Enemy(EnemyType.SKELETON);
    }
}
