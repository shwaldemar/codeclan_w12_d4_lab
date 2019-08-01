import org.junit.Before;

public class TestSetup {

    protected Fighter fighter1;
    protected Weapon medsword;


    @Before
    public void setUp(){
        fighter1 = new Fighter();
        medsword = new Weapon(WeaponType.MEDIUMSWORD);
    }
}
