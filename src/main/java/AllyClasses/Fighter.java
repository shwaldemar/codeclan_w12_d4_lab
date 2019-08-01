package AllyClasses;

import Abilities.Ability;
import Abilities.AbilityType;
import Game.ITakeDmg;
import Items.ArmourType;
import Items.Weapon;
import Items.WeaponType;

import java.util.ArrayList;

public class Fighter extends Ally {

    private Weapon weapon;

    public Fighter(String name){
        super(ArmourType.CLOTH,100,name);
        this.abilities = new ArrayList<Ability>();
        this.abilities.add(new Ability(AbilityType.SWINGWEAPON));
        this.currentAbility = abilities.get(0);
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
