package AllyClasses;

import Game.ITakeDmg;
import Items.ArmourType;
import Items.Staff;
import Items.StaffType;


public class Cleric extends Ally{

    private Staff staff;

    public Cleric(String name) {
        super(ArmourType.CLOTH,50,name);
        this.staff = new Staff(StaffType.BADSTAFF);
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int calculateAttackValue(){
        return this.staff.getType().getDmgvalue();
    }

    public int calculateHealingValue(){
        return this.staff.getType().getHealvalue();
    }

    public void attack(ITakeDmg victim){
        victim.loseHP(calculateAttackValue());
    }


}
