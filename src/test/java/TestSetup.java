import AllyClasses.Fighter;
import EnemyClasses.Enemy;
import EnemyClasses.EnemyType;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;

public class TestSetup {

    protected Fighter fighter1;
    protected Weapon medsword;
    protected Enemy skeleton1;

    @Before
    public void setUp(){
        fighter1 = new Fighter("harry");
        medsword = new Weapon(WeaponType.MEDIUMSWORD);
        skeleton1 = new Enemy(EnemyType.SKELETON);
    }
}
