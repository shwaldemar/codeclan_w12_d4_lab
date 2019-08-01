public abstract class Ally {

    private ArmourType armour;
    private WeaponType weapon;
    private int HP;

    public Ally(ArmourType armour, WeaponType weapon,int HP) {
        this.armour = armour;
        this.weapon = weapon;
        this.HP=HP;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
