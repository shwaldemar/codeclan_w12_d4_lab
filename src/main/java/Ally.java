public abstract class Ally {

    private Armour armour;
    private Weapon weapon;
    private int HP;

    public Ally(Armour armour, Weapon weapon,int HP) {
        this.armour = armour;
        this.weapon = weapon;
        this.HP=HP;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
