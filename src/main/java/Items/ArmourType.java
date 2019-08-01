package Items;

public enum ArmourType {
    CHAIN(6),
    PLATE(10),
    CLOTH(1),
    BAMBOO(5);

    private final int value;

    public int getValue(){
        return value;
    }

    ArmourType(int value){
        this.value=value;
    }

}
