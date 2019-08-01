package AllyClasses;

import Game.ITakeDmg;
import Items.ArmourType;

public abstract class Ally implements ITakeDmg {

    private ArmourType armour;
    private int HP;
    private String name;

    public Ally(ArmourType armour, int HP, String name) {
        this.armour = armour;
        this.HP=HP;
        this.name=name;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
