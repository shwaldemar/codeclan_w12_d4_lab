import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest extends TestSetup{


    @Test
    public void canGetAndSetWeapon(){
        fighter1.setWeapon(medsword);
        assertEquals(medsword,fighter1.getWeapon());
    }

    @Test
    public void canGetAndSetArmour(){
        fighter1.setArmour(ArmourType.PLATE);
        assertEquals(ArmourType.PLATE,fighter1.getArmour());
    }


}
