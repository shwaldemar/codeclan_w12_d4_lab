import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest extends TestSetup{
    @Test
    public void wizardHasName(){
        assertEquals("gordon",wizard1.getName());
    }

    @Test
    public void canGetAndSetWand(){
        wizard1.setWand(goodwand);
        assertEquals(goodwand,wizard1.getWand());
    }
}
