package AllyClasses;

import Game.ITakeDmg;
import Items.ArmourType;
import Items.Pet;
import Items.Wand;
import Items.WandType;

public class Wizard extends Ally{

    private Wand wand;
    private Pet pet;

    public Wizard(String name) {
        super(ArmourType.CLOTH,75,name);
        this.pet = new Pet("Barry");
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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void attack(ITakeDmg victim){
        victim.loseHP(calculateAttackValue());
    }

}
