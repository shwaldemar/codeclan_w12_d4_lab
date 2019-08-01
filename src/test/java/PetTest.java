import Items.ArmourType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest extends TestSetup{
    @Test
    public void canGetAndSetArmour(){
        pet1.setArmour(ArmourType.BAMBOO);
        assertEquals(ArmourType.BAMBOO,pet1.getArmour());
    }
}
