package AllyClasses;

import Abilities.Ability;
import Game.IDealDmg;
import Game.IHaveAbilities;
import Game.ITakeDmg;
import Items.ArmourType;

import java.util.ArrayList;

public abstract class Ally implements ITakeDmg, IDealDmg, IHaveAbilities {

    private ArmourType armour;
    private int HP;
    private String name;
    protected ArrayList<Ability> abilities;
    protected Ability currentAbility;

    public Ally(ArmourType armour, int HP, String name, ArrayList<Ability>abilities) {
        this.armour = armour;
        this.HP=HP;
        this.name=name;
        this.abilities = abilities;
        this.currentAbility = abilities.get(0);
    }

    public Ally(ArmourType armour, int HP, String name) {
        this.armour = armour;
        this.HP=HP;
        this.name=name;
        this.currentAbility=null;
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

    public void setHP(int value) {
        this.HP=value;
    }

    public void loseHP(int dmg){
        setHP(getHP()-dmg);
    }

    public void gainHP(int value){
        this.HP+=value;
    }

    public void die(){
        System.out.println(name + " has fallen in battle.");
    }

    public boolean isAlive(){
        if (getHP()>0)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void chooseAbility(Ability ability){
        this.currentAbility=ability;
    }
}
