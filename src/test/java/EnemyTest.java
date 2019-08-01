import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest extends TestSetup{


    @Test
    public void canSetHP(){
        skeleton1.setHP(60);
        assertEquals(60,skeleton1.getHP());
    }


}
