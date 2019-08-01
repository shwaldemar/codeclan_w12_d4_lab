import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest extends TestSetup{

    @Test
    public void startsWithEnemies(){
        assertEquals(3,room1.numberOfEnemiesLeft());
    }
    
}
