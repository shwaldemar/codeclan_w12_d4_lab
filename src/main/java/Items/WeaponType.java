package Items;

public enum WeaponType {
    SHORTSWORD(3),
    MEDIUMSWORD(5),
    LONGSWORD(10);

    private final int value;

    public int getValue(){
        return value;
    }

    WeaponType(int value){
        this.value=value;
    }

}
