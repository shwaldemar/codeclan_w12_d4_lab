import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EnemyTest extends TestSetup{


    @Test
    public void canSetHP(){
        skeleton1.setHP(60);
        assertEquals(60,skeleton1.getHP());
    }

    @Test
    public void skeletonTakes10000dmgIsntAlive(){
        skeleton1.loseHP(10000);
        assertFalse(skeleton1.isAlive());
    }

    @Test
    public void skeletonCanHeal75Hp(){
        skeleton1.gainHP(75);
        assertEquals(80,skeleton1.getHP());
    }


}
