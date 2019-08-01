import Items.ArmourType;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class WizardTest extends TestSetup{


    @Test
    public void canGetAndSetArmour(){
        wizard1.setArmour(ArmourType.PLATE);
        TestCase.assertEquals(ArmourType.PLATE,wizard1.getArmour());
    }

    @Test
    public void canGetAndSetHP(){
        wizard1.setHP(5);
        TestCase.assertEquals(5,wizard1.getHP());
    }

    @Test
    public void DiesIfTakes10000DMG(){
        wizard1.loseHP(10000);
        assertFalse(wizard1.isAlive());
    }

    @Test
    public void canGain50HP(){
        wizard1.gainHP(50);
        TestCase.assertEquals(125,wizard1.getHP());
    }

    @Test
    public void wizardHasName(){
        assertEquals("gordon",wizard1.getName());
    }

    @Test
    public void canGetAndSetWand(){
        wizard1.setWand(goodwand);
        assertEquals(goodwand,wizard1.getWand());
    }

    @Test
    public void canCalculateAttackValue(){
        assertEquals(2,wizard1.getWand().getType().getValue());
    }

}
