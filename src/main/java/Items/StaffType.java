package Items;

public enum StaffType {
    BADSTAFF(3,7),
    AVERAGESTAFF(4,12),
    GREATSTAFF(5,15);

    private final int dmgvalue;
    private final int healvalue;

    public int getDmgvalue() {
        return dmgvalue;
    }

    public int getHealvalue() {
        return healvalue;
    }

    StaffType(int dmgvalue, int healvalue){
        this.dmgvalue=dmgvalue;
        this.healvalue=healvalue;
    }

}
