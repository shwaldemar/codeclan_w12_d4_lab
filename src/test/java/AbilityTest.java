import Abilities.AbilityBehaviour;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbilityTest extends TestSetup{

    @Test
    public void swingWeaponHasBaseDamageOfZero(){
        assertEquals(0,swingweapon1.getType().getValue());
    }

    @Test
    public void swingWeaponHasBehaviourOfDoesDmg(){
        assertEquals(AbilityBehaviour.DOESDMG,swingweapon1.getType().getBehaviour());
    }
}
