package AllyClasses;

import Game.ITakeDmg;
import Items.ArmourType;
import Items.Weapon;
import Items.WeaponType;

public class Fighter extends Ally {

    private Weapon weapon;

    public Fighter(String name){
        super(ArmourType.CLOTH,100,name);
        weapon = new Weapon(WeaponType.SHORTSWORD);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int calculateAttackValue(){
        return this.weapon.getType().getValue();
    }

    public void attack(ITakeDmg victim){
        victim.loseHP(calculateAttackValue());
    }
}
