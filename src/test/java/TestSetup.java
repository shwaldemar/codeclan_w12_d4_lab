import AllyClasses.Fighter;
import AllyClasses.Wizard;
import EnemyClasses.Enemy;
import EnemyClasses.EnemyType;
import Items.Wand;
import Items.WandType;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;

public class TestSetup {

    protected Fighter fighter1;
    protected Weapon medsword;
    protected Wand goodwand;
    protected Enemy skeleton1;
    protected Wizard wizard1;

    @Before
    public void setUp(){
        fighter1 = new Fighter("harry");
        wizard1 = new Wizard("gordon");
        medsword = new Weapon(WeaponType.MEDIUMSWORD);
        goodwand = new Wand(WandType.GOOD);
        skeleton1 = new Enemy(EnemyType.SKELETON);
    }
}
