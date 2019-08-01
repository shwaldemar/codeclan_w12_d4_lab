package AllyClasses;

import Game.IDealDmg;
import Game.ITakeDmg;
import Items.ArmourType;

public abstract class Ally implements ITakeDmg, IDealDmg {

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

}
