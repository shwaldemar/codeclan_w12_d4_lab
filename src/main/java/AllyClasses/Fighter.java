package AllyClasses;

import Items.ArmourType;
import Items.Weapon;
import Items.WeaponType;

public class Fighter extends Ally {

    private Weapon weapon;

    public Fighter(){
        super(ArmourType.CLOTH,100);
        weapon = new Weapon(WeaponType.SHORTSWORD);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
