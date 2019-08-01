import Items.ArmourType;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class ClericTest extends TestSetup{

    @Test
    public void canGetAndSetArmour(){
        cleric1.setArmour(ArmourType.PLATE);
        TestCase.assertEquals(ArmourType.PLATE,cleric1.getArmour());
    }

    @Test
    public void canGetAndSetHP(){
        cleric1.setHP(5);
        TestCase.assertEquals(5,cleric1.getHP());
    }

    @Test
    public void diesIfTakes10000DMG(){
        cleric1.loseHP(10000);
        assertFalse(cleric1.isAlive());
    }

    @Test
    public void canGain50HP(){
        cleric1.gainHP(50);
        TestCase.assertEquals(100,cleric1.getHP());
    }

    @Test
    public void clericHasName(){
        assertEquals("cedric",cleric1.getName());
    }

    @Test
    public void canGetAndSetStaff(){
        cleric1.setStaff(staff1);
        assertEquals(staff1,cleric1.getStaff());
    }

    @Test
    public void canCalculateAttackValue(){
        assertEquals(3,cleric1.getStaff().getType().getDmgvalue());
    }

    @Test
    public void attackingSkeletonMakesItLoseHP(){
        cleric1.attack(skeleton1);
        assertEquals(2,skeleton1.getHP());
    }


}
