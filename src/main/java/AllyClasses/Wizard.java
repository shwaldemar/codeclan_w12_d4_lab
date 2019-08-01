package AllyClasses;

import Items.ArmourType;
import Items.Wand;
import Items.WandType;

public class Wizard extends Ally{

    private Wand wand;

    public Wizard(String name) {
        super(ArmourType.CLOTH,75,name);
        this.wand = new Wand(WandType.BAD);
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public int calculateAttackValue(){
        return this.wand.getType().getValue();
    }
}
