import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest extends TestSetup {

    @Test
    public void startsGameWithAllies(){
        assertEquals(3, game1.getNumberOfAllies());
    }

    @Test
    public void startsGameWithRooms(){
        assertEquals(3, game1.getNumberOfRooms());
    }
}
