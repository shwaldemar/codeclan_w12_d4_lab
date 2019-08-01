package Items;

import Game.ITakeDmg;

public class Pet{
    private String name;
    private ArmourType armour;
    private int defaultShieldValue;

    public Pet(String name) {
        this.name = name;
        this.armour = ArmourType.CLOTH;
        this.defaultShieldValue=1;
    }

    public String getName() {
        return name;
    }

    public int getDefaultShieldValue() {
        return defaultShieldValue;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }
}
