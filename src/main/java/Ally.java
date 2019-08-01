public abstract class Ally {

    private ArmourType armour;
    private int HP;

    public Ally(ArmourType armour, int HP) {
        this.armour = armour;
        this.HP=HP;
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
